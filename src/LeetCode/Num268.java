package LeetCode;

import java.util.Arrays;

public class Num268 {
    public int missingNumber(int[] nums) {
        int result = 0,length = nums.length;
        Arrays.sort(nums);
        if (nums[0] !=0){
            return 0;
        }
        if (length ==1){
            return 1;
        }

        for (int i=1;i<length;i++){
            if (nums[i] - nums[i-1] !=1){
                result =  nums[i-1]+1;
                break;
            }else {
                result = nums[i]+1;
            }
        }
        return result;
    }
}
