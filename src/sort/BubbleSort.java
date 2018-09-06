package sort;

/**
 * @author bibingwei
 *
 * 1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 3. 针对所有的元素重复以上的步骤，除了最后一个。
 * 4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] unsort = {5,8,3,2,4,1,9};
        System.out.println(new BubbleSort().solution(unsort));
    }
    public int[] solution(int[] unSort){
        int len = unSort.length;
        for (int i=len-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if (unSort[j] > unSort[j+1]){
                    int temp = unSort[j];
                    unSort[j] = unSort[j+1];
                    unSort[j+1] = temp;
                }
            }
        }
        return unSort;
    }
}
