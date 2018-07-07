package LeetCode;

public class Num189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        new Num189().rotate(nums,0);
    }
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        int length = nums.length;
        while (k>0){
            for (int i=length-1;i>0;--i){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
            --k;
        }
        for(int num:nums){
            System.out.print(num);
        }
    }
}
