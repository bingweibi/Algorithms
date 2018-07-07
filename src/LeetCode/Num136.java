package LeetCode;

import java.util.Arrays;

public class Num136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(new Num136().singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int temp = 0;
        Arrays.sort(nums);
        if (nums.length == 1){
            return nums[0];
        }
        if (nums[0]!= nums[1]){
            temp =  nums[0];
        }
        for (int i=1;i<nums.length-2;i++){
            if (nums[i] - nums[i-1]!= 0 && nums[i+1]-nums[i] !=0){
                temp =  nums[i];
            }
        }
        if (nums[nums.length-1]!= nums[nums.length-2]){
            temp =  nums[nums.length-1];
        }
        return temp;
    }
}
