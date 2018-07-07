package LeetCode;

/**
 * @author bibingwei
 *   *
 */
public class Num026 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Num026().removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        int num = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != nums[num]){
                num++;
                nums[num] = nums[i];
            }
        }
        num++;
        return num;
    }
}
