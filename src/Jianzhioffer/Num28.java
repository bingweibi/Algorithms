package Jianzhioffer;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0。
 */
public class Num28 {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(new Num28().MoreThanHalfNum_Solution(array));
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        int num = 0;
        int length = array.length/2;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        Arrays.sort(array);
        int temp = 1;
        for (int i=0;i<array.length;i++){
            if (i>=1 && array[i] != array[i-1]){
                temp = 1;
            }
            map.put(array[i],temp++);
        }
        for (int i = 0;i<array.length;i++){
            if (map.get(array[i]) > length){
                num = array[i];
                break;
            }

        }
        return num;
    }
}
