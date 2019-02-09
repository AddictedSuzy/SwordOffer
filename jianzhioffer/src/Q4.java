/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 二维数组，从左到右依次递增，每一列从上到下递增，判断一个二维数组中是否有该整数
 * 解法：
 * @author Earl_iu
 */
public class Q4 {
    public static void main(String agrs[]){
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Q4_test.run(array,4));
    }
}

class Q4_test{
    public static boolean run(int[][] array, int target){
        int y = array.length;           // 行数
        int x = array[1].length;        // 列数
        for(int i = 0;i<y;i++){
            for(int j = x-1; j>=0;j--){ 
                if(array[i][j]>target){ // 如果出现该点大于target，说明这一列不用看了，因为我们是从上往下，从右往左的查找，如果大于的话，说明这一个点的下面都是比target大的 
                    x = j;      // 更新x的值，来保证那些肯定比target大的列已经被清除了
                }else if(array[i][j]==target){
                    return true;
                }else{
                   break;
                }
            }
        }       
        return false;
    }
}
