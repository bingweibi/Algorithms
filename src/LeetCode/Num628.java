package LeetCode;

import java.util.Arrays;

public class Num628 {
    public static void main(String[] args) {
        int[] nums = {903,606,48,-474,313,-672,872,-833,899,-629,558,-368,231,621,716,-41,-418,204,-1,883,431,810,452,
                -801,19,978,542,930,85,544,-784,-346,923,224,-533,-473,499,-439,-925,171,-53,247,373,898,700,406,-328,
                -468,95,-110,-102,-719,-983,776,412,-317,606,33,-584,-261,761,-351,-300,825,224,382,-410,335,187,880,
                -762,503,289,-690,117,-742,713,280,-781,447,227,-579,-845,-526,-403,-714,-154,960,-677,805,230,591,442,
                -458,-905,832,-285,511,536,-86};
        System.out.println(new Num628().maximumProduct(nums));
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        if (nums[0] *  nums[1] > nums[length-2] * nums[length-3]){
            return nums[length-1] *  nums[0] *  nums[1];
        }else {
            return nums[length-1] * nums[length-2] * nums[length-3];
        }
    }
}
