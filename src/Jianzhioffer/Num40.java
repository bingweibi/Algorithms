package Jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 */

public class Num40 {

    public static void main(String[] args) {
        int[] array = {4,6,2,2,3,3,8,8,9,9,1000000,1000000};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        new Num40().FindNumsAppearOnce(array,num1,num2);
    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<Integer>(2);
        Arrays.sort(array);
        if (array.length ==0){
            return ;
        }
        if (array[0] != array[1]){
            list.add(array[0]);
        }
        for (int i=1;i<=array.length-2;i++){
            if (array[i-1]!=array[i] && array[i] != array[i+1]){
                list.add(array[i]);
                if (list.size()==2){
                    break;
                }
            }
        }
        if (array[array.length-1]!=array[array.length-2]){
            list.add(array[array.length-1]);
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}
