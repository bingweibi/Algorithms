package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bibingwei
 */
public class Num532 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(new Num532().findPairs(nums,-1));
    }
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length ==0 || k<0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int n : nums) {
            map.put(n,map.getOrDefault(n, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(k==0) {
                if(entry.getValue()>=2) {
                    count++;
                }
            } else {
                if(map.containsKey(entry.getKey()+k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
