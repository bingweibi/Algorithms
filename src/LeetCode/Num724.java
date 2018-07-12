package LeetCode;

public class Num724 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(new Num724().pivotIndex(nums));
    }
    public int pivotIndex(int[] nums) {
        int len = nums.length,sum1 = 0,sum2 =0,result = -1;
        for (int i=0;i<len;i++){
            sum1 = 0;sum2 =0;
            for (int j=0;j<i;j++){
                sum1 += nums[j];
            }
            for (int k=len-1;k>i;k--){
                sum2 += nums[k];
            }
            if (sum1 == sum2){
                result =  i;
                break;
            }
        }
        return result;
    }
}
