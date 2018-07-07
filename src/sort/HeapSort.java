package sort;

/**
 * @author bibingwei
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] unSort = {2, 5, 6, 4, 1, 3, 8, 7, 9};
        //进行对堆调整
        heapSort(unSort,unSort.length);
        for (int anUnSort : unSort) {
            System.out.print(anUnSort + " ");
        }
    }

    private static void heapSort(int[] unSort, int length) {

        int len = length-1;
        //找出最大值，并置于堆顶
        for (int i = len/2-1;i >= 0;i--){
            heapAdjust(unSort,i,len);
        }

        //最大值已排序
        while (len >= 0){
            swap(unSort,0,len);
            len--;
            heapAdjust(unSort,0,len);
        }
    }

    private static void heapAdjust(int[] unSort, int i, int length) {

        int left,right,j;
        while ((left = i*2+1) <= length){
            right = left+1;
            j=left;
            if(j < length && unSort[right] > unSort[left]){
                j++;
            }
            if (unSort[i] < unSort[j]){
                swap(unSort,j,i);
            }else {
                break;
            }
            i=j;
        }
    }

    private static void swap(int[] unSort,int min, int max) {
        int temp = unSort[min];
        unSort[min] = unSort[max];
        unSort[max] = temp;
        for (int anUnSort : unSort) {
            System.out.print(anUnSort + " ");
        }
        System.out.println();
    }
}
