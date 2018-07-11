package LeetCode;

/**
 * @author bibingwei
 */
public class Num027 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(new Num027().removeElement(nums,2));
    }

    public int removeElement(int[] nums, int val) {
        int num = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != val){
                nums[num] = nums[i];
                num++;
            }
        }
        return num;
    }
}
