package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Num643 {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(new Num643().findMaxAverage(nums,1));
    }
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length < k){
            return 0;
        }
        int len = nums.length,result = Integer.MIN_VALUE;

        for (int i=0;i+k<=len;i++){
            int sum =0;
            for (int j=i;j<i+k;j++){
                sum += nums[j];
            }
            result = Math.max(result,sum);

        }
        return (double)result/k;
    }
}
