package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Num217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(new Num217().containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        boolean flag = false;
        int length = nums.length;
        for (int i=0;i<length;i++){
            if (map.containsKey(nums[i])){
                map.get(nums[i]+1);
                flag = true;
                break;
            }else {
                map.put(nums[i],0);
            }
        }
        return flag;
    }
}
