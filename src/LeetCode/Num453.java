package LeetCode;

import java.util.Arrays;

public class Num453 {
    public static void main(String[] args) {
        int[] nums = {1,2147483647};
        System.out.println(new Num453().minMoves(nums));
    }
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int n : nums) {
            min = Math.min(min, n);
            sum += n;
        }
        return sum - nums.length * min;
    }
}
