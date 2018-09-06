package sort;

/**
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始/末尾位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，
 * 然后放到已排序序列的起始/末尾。
 * 以此类推，直到所有元素均排序完毕。
 * @author bibingwei
 */
public class SelectorSort {
    public static void main(String[] args) {
        int[] unSort = {2,5,6,4,1,3,8,7,9};
        for (int i=0;i < unSort.length;i++){
            for (int j = i+1;j<unSort.length;j++){
                if (unSort[i]>unSort[j]){
                    int temp = unSort[i];
                    unSort[i] = unSort[j];
                    unSort[j] = temp;
                }
            }
        }
        for (int anUnSort : unSort) {
            System.out.print(anUnSort + " ");
        }
    }
}
