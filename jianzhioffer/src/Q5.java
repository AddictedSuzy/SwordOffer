/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Earl_iu
 */
public class Q5 {
    public static void main (String args[]){
        System.out.println(Q5_test3.run("we are happy"));
    }
}

class Q5_test{
    public static String run(String s){
        long begin = System.nanoTime();
        int ls = s.length();
        int count = 0;
        for(int i =0;i<ls;i++){
            if((s.charAt(i))==' '){
                count++;
            }
        }
        int ls2 = ls + count*2;
        char[] c = new char[ls2];
        int j = 0;
        for(int i=0;i<ls;i++){
            if(s.charAt(i) == ' '){
                c[j] ='%';
                c[j+1]='2';
                c[j+2]='0';
                j = j+3;
            }else{
                c[j] = s.charAt(i);
                j++;
            }
        }
        long end = System.nanoTime();
        System.out.println(end-begin);
        return new String(c);
        // time 5333
    }
}

class Q5_test2{
    public static String run(String s){
        long begin = System.nanoTime();
        s =  s.replaceAll(" ", "20%");
        long end = System.nanoTime();
        System.out.println(end-begin);
        return s;
       // time 1167999
    }
}

class Q5_test3{
    public static String run(String s){
        long begin = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        long end = System.nanoTime();
        System.out.println(end-begin);
        return s.toString();
        // time 31179
    }
}
