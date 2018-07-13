package LeetCode;

public class Num674 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(new Num674().findLengthOfLCIS(nums));
    }
    public int findLengthOfLCIS(int[] nums) {

        int len = nums.length,count =1,max=0;
        if (len ==1||len==0){
            return len;
        }
        for(int i=1;i<len;i++){
            if (nums[i]>nums[i-1]){
                ++count;
            }else {
                max= Math.max(max,count);
                count=1;
            }
        }
        max= Math.max(max,count);
        return max == 0 ? count:max;
    }
}
