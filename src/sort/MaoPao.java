package sort;

/**
 * @author bibingwei
 *
 * 比较相邻的元素。 如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。 在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] unSort = {2,5,6,4,1,3,8,7,9};
        int min;
        for (int i= unSort.length-1;i>=0;i--){
            for (int j=0;j<i;j++){
                if (unSort[j]>unSort[j+1]){
                    int temp = unSort[j];
                    unSort[j] = unSort[j+1];
                    unSort[j+1] = temp;
                }
            }
        }

        for (int anUnSort : unSort) {
            System.out.print(anUnSort + " ");
        }
    }
}
