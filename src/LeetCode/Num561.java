package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author bibingwei
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对,
 * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 *
 * 输入: [1,4,3,2]
 * 输出: 4
 * 解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
 */

public class Num561 {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i=i+2){
            result += nums[i];
        }
        return result;
    }
}
