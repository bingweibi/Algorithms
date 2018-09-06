package ToOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author bibingwei
 * 滑动窗口最大值
 */
public class Num51 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,2,6,2,5,1};
        System.out.println(new Num51().maxInWindows(nums,3));
    }
    public ArrayList<Integer> maxInWindows(int [] num, int size){

        int len = num.length;
        int slow = 0,faster = slow+size;
        int[] temp = new int[size];
        ArrayList<Integer> list = new ArrayList<>();
        if (size ==0){
            return list;
        }
        while (faster <= len){
            for (int i=slow,j=0;i<faster;i++,j++){
                temp[j] = num[i];
            }
            Arrays.sort(temp);
            list.add(temp[size-1]);
            faster++;
            slow++;
        }
        return list;
    }
}
