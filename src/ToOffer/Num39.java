package ToOffer;

import java.util.ArrayList;

/**
 * @author bibingwei
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Num39 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        new Num39().FindNumbersWithSum(array,7);
    }
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int low =0,len = array.length,high = len-1,min = Integer.MAX_VALUE;
        int[] temp1 = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        while (low <= high){
            int temp = array[low] + array[high];
            if (temp < sum){
                low++;
            }else if (temp > sum){
                high--;
            }else {
                if (array[low]*array[high] < min) {
                    min = array[low]*array[high];
                    temp1[0] = array[low];
                    temp1[1] = array[high];
                }
                low++;
            }
        }
        if (temp1[0] == 0 && temp1[1] ==0){

        }else {
            list.add(temp1[0]);
            list.add(temp1[1]);
        }
        return list;
    }
}
