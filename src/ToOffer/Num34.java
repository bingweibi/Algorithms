package ToOffer;

/**
 * @author bibingwei
 * 统计一个数字在排序数组中出现的次数。
 */
public class Num34 {
    public int GetNumberOfK(int [] array , int k) {
        int len = array.length,count = 0;
        for (int anArray : array) {
            if (anArray == k) {
                count++;
            }
        }
        return count;
    }
}
