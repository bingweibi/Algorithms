package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Num169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(new Num169().majorityElement(nums));
    }
    public int majorityElement(int[] nums) {
        if (nums.length ==1){
            return nums[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        int j = 1,max = 0,result = 0;
        for (int i=0;i< nums.length;i++){

            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if (map.get(nums[i])>max){
                    max = map.get(nums[i]);
                    result = nums[i];
                }
            }else {
                map.put(nums[i],j);
            }
        }

        return result;
    }
}
