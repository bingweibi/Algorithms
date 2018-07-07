package LeetCode;

public class Num001 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int j=0;j<nums.length;j++){
            for (int k=j+1;k< nums.length;k++){
                if (target == nums[j]+nums[k]){
                    result[0] = j;
                    result[1] = k;
                    return result;
                }
            }
        }
        return nums;
    }
}
