package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Num219 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(new Num219().containsNearbyDuplicate(nums,3));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        int length = nums.length;
        if (length <=1){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<length;i++){
            if (map.containsKey(nums[i])&& i-map.get(nums[i])<=k){
                flag =  true;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return flag;
    }
}
