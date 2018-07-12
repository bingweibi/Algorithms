package LeetCode;

public class Num665 {
    public static void main(String[] args) {
        int[] nums = {4,2,3,1};
        System.out.println(new Num665().checkPossibility(nums));
    }
    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (i == 0 || i + 1 == nums.length - 1) {
                    cnt++;
                } else {
                    if (nums[i - 1] >= nums[i + 1]) {
                        nums[i + 1] = nums[i];
                    } else {
                        nums[i] = nums[i - 1];
                    }
                    cnt++;
                }
            }
            if (cnt > 1) {
                break;
            }
        }
        return cnt == 1 || cnt == 0;
    }
}
