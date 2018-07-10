package LeetCode;

/**
 * @author bibingwei
 *  *
 */
public class Num414 {
    public int thirdMax(int[] nums) {
        long max1, max2, max3;
        max2 = Long.MIN_VALUE;
        max3 = max2;
        max1 = nums[0];
        for(int i=1; i<nums.length; i++) {
            int curNum = nums[i];
            if(curNum > max1) {
                max3 = max2;
                max2 = max1;
                max1 = curNum;
            } else if(curNum > max2) {
                if(curNum != max1) {
                    max3 = max2;
                    max2 = curNum;
                }
            } else if(curNum > max3) {
                if(curNum != max2) {
                    max3 = curNum;
                }
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }
}
