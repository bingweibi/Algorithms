package Jianzhioffer;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */

public class Num35 {
    public static void main(String[] args) {
        int[] array = {1,2,6,5,4,3,7,0};
        System.out.println(new Num35().InversePairs(array));
    }
    public int InversePairs(int [] array) {
        int length = array.length;
        int sum = 0;
        for (int i=1;i<length;++i){
            int temp = 0;
            while(temp < i){
                if (array[temp] > array[i]){
                    ++sum;
                }
                ++temp;
            }
        }
        return sum % 1000000007;
    }
}
