package ToOffer;

/**
 * @author bibingwei
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class Num32 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        System.out.println(new Num32().InversePairs(array));
    }
    public int InversePairs(int [] array) {
        int len = array.length,count = 0;
        for (int i=0;i<len-1;i++){
            for (int j=i+1;j<len;j++){
                if (array[i] > array[j]){
                    count++;
                }
            }
        }
        return count%1000000007;
    }
}
