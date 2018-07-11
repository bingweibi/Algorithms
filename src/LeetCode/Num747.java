package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Num747 {
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len ==1){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<len;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        if (nums[len-1]>=nums[len-2]*2){
            return map.get(nums[len-1]);
        }else {
            return -1;
        }
    }
}
