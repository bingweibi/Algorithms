package LeetCode;

public class Num303 {
    int[] num;
//    public NumArray(int[] nums) {
//        num = nums;
//    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int start = i;start<=j;start++){
            sum += num[start];
        }
        return sum;
    }
}
