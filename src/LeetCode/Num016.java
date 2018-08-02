package LeetCode;

import java.util.*;

public class Num016 {
    public static void main(String[] args) {
        int[] num = {1,1,-1,-1,3};
        System.out.println(new Num016().threeSumClosest(num,-1));
    }
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length,flag =len-1,min = Integer.MAX_VALUE,sum,k=len-1,result=0;
        Arrays.sort(nums);
        for (int i=0;i< flag;i++){
            for (int j=i+1;j< flag;j++){
                for (;k > j;k--){
                    sum = (nums[i] + nums[j] + nums[k]);
                    if ( Math.abs(sum - target) < min){
                        min = Math.abs(sum - target);
                        flag = k;
                        result = sum;
                    }
                }
                k= flag;
            }
        }
        return result;
    }
}
