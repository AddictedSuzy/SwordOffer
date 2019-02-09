


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Earl_iu
 */
public class Q3 {
    public static void main(String args[]){
        int[] array = {1,2,4,5,6,8};
        System.out.println(way3.search(array,2,array.length));
    }
}

class way1{
    public static void run(){
         HashMap<Integer,Integer> h = new HashMap();
        int[] array = {1,2,2,3,4,5,2,2,5};
        for(int i =0;i<array.length;i++){
            int count = 0;
            if(h.get(array[i])==null){
                count = 1;
                h.put(array[i], count);
            }else{
                count = h.get(array[i]);
                count ++;
                h.put(array[i],count);
            }
        }
        System.out.println(h.get(2));
    }
}

class way2{
    public static void run(){
        int[] array = {2,3,1,0,2,5,3};
        boolean flag = true;
        for(int i=0;i<array.length;i++){
            while(i!=array[i]&flag){
                if(array[i]==array[array[i]]){
                    System.out.println(array[i]);
                    flag = false;
                }else{
                    int temp = array[i];
                    array[i] = array[array[i]];
                    array[temp] = temp;
                }
            }
        }
    }
}

class way3{  // 只是一个二分查找
    public static int search(int[] array,int target, int index){
        int mid = index/2;
        if(array[mid]> target){
            return search(array,target,mid-1);
        }else if(array[mid] < target){
            return search(array,target,mid+1);
        }else{
            return mid;
        }
    }
}
