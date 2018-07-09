package LeetCode;

import java.util.Arrays;

public class Num283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new Num283().moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = length-1;i>=0;i--){
            if (nums[i] == 0){
                for (int k=i;k<length-1;k++){
                    int temp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = temp;
                }
            }
        }
        for (int num:nums){
            System.out.print(num + " ");
        }
    }
}
