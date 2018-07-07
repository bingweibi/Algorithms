package LeetCode;

public class Num035 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        System.out.println(new Num035().searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        int flag = 0;
        if (nums[0]>=target){
            return 0;
        }
        if (nums[nums.length-1]<target){
            return nums.length;
        }
        if (nums[nums.length-1]==target){
            return nums.length-1;
        }
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i] == target){
                flag = i;
                break;
            }
            if (nums[i]<target&& nums[i+1]>target){
                flag = i+1;
                break;
            }
        }

        return flag;
    }
}
