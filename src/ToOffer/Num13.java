package ToOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bibingwei
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Num13 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7};
        new Num13().reOrderArray(arrays);
    }
    public void reOrderArray(int [] array) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int anArray : array) {
            if (anArray % 2 != 0) {
                list.add(anArray);
            } else {
                list1.add(anArray);
            }
        }
        for (int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        for (int i=0;i<list1.size();i++){
            array[i+list.size()] = list1.get(i);
        }
    }
}
