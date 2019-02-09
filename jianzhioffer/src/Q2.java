

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Earl_iu
 */
public class Q2 {
    public static void main(String agrs[]){
        test t1 = test.newInstance();
    }
}

// 饿汉式
class test{
    private static test t1 = new test();
    
    private test(){
        
    }
    
    public static test newInstance(){
        return t1; 
    } 
}

// 懒汉式
class test2{
    private static test2 t2 = null;
    private test2(){
        
    }
    
    public static test2 newInstance(){
        if(t2==null){
            synchronized(test2.class){
                if(t2==null){
                    t2 = new test2();
                }
            }
        }
        return t2;
    }
}

// 静态内部类
class test3{
    
    private static class inner{
        private static test3 test3 = new test3();
    }
    public static test3 getInstance(){
        return inner.test3;
}
    
}