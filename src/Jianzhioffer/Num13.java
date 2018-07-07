package Jianzhioffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Queue;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author bibingwei
 */
public class Num13 {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int anArray : array) {
            if (anArray % 2 != 0) {
                list.add(anArray);
            }
        }
        for (int anArray : array) {
            if (anArray % 2 == 0) {
                list.add(anArray);
            }
        }
        for (int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
    }
}
