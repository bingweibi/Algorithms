package LeetCode;

import java.lang.annotation.Target;

/**
 * @author bibingwei
 */
public class Num034 {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(new Num034().searchRange(nums, 5));
    }
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        int len = nums.length,i=0,j=len-1;
        if (len ==0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        while (i<len && nums[i] != target){
            i++;
        }
        result[0] = i;
        while (j>=0 && nums[j] != target){
            j--;
        }
        result[1] = j;

        if ( i>=len){
            result[0] = -1;
            result[1] = -1;
        }
        return result;
    }
}
