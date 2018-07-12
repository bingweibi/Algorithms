package LeetCode;

import java.util.Arrays;

/**
 * @author bibingwei
 * * 没看懂意思
 */
public class Num645 {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(new Num645().findErrorNums(nums)));
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[nums[i]-1] != nums[i]) {
                swap(nums, i, nums[i]-1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1){
                return new int[]{nums[i], i+1};
            }
        }
        return null;
    }
}
