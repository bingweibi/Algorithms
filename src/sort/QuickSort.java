package sort;

/**
 * @author bibingwei
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] unSort = {2,5,6,4,1,3,8,7,9};
        int low = 0,high = unSort.length-1;
        int[] nums = qSort(unSort,low,high);
        for (int anUnSort : nums) {
            System.out.print(anUnSort + " ");
        }
    }

    private static int[] qSort(int[] unSort, int low, int high) {

        int flag = unSort[low];
        int i= low,j= high;
        while (i <= j){
            while (unSort[i] < flag){
                i++;
            }
            while (unSort[j] > flag){
                j--;
            }
            if (i <= j){
                int temp = unSort[i];
                unSort[i] = unSort[j];
                unSort[j] = temp;
                i++;
                j--;
            }
        }

//        for (int anUnSort : unSort) {
//            System.out.print(anUnSort + " ");
//        }
//        System.out.println();

        if (low < j){
            qSort(unSort,low,j);
        }
        if (i<high){
            qSort(unSort,i,high);
        }
        return unSort;
    }
}
