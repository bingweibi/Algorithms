package sort;


import org.omg.CORBA.BAD_QOS;

/**
 * @author bibingwei
 *
 * 1. 从数列中选择一个元素，称为基准元素
 * 2. 重新排序数列，将所有比基准元素小的元素摆在基准的前面，所有比基准元素大的元素摆在基准元素的后面，
 *  在这次分区之后，基准元素就位于中间，这个称为分区操作
 * 3. 递归地将小于基准的放在基准元素前面，大于的放在基准元素后面
 * 4. 递归到最底部时，数列的大小是零或一，也就是已经排序好了
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] unSort = {3,2,5,1,7};
        new QuickSort().solution(unSort,0,unSort.length-1);
    }
    /* 快排2 */
    private void solution(int[] unSort,int low,int high) {
        int flag = unSort[low];
        int i=low,j=high;
        while (i <= j){
            while (unSort[i] < flag){
                i++;
            }
            while (unSort[j] > flag){
                j--;
            }

            if (i<=j){
                int temp = unSort[i];
                unSort[i] = unSort[j];
                unSort[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j){
            solution(unSort,low,j);
        }
        if (i<high){
            solution(unSort,i,high);
        }
    }
//    快排1
//    public void solution(int[] unSort){
//        int len = unSort.length,start = 0,end =len-1;
//        qSort(unSort,start,end);
//    }
//
//    private void qSort(int[] unSort, int start, int end) {
//
//        if (start <= end) {
//            //选定基准元素
//            int pivot = partition(unSort,start, end);
//            //排序基准左边元素
//            qSort(unSort,start,pivot-1);
//            //排序基准右边元素
//            qSort(unSort,pivot+1,end);
//        }
//    }
//
//    private int partition(int[] unSort, int start, int end) {
//
//        int pivot = unSort[start];
//        while (start < end){
//            //从后往前找到比基准元素小的
//            while (start <end && unSort[end] > pivot){
//                --end;
//            }
//            unSort[start] = unSort[end];
//            //从前往后找到比基准元素大的
//            while (start < end && unSort[start] < pivot){
//                ++start;
//            }
//            unSort[end] = unSort[start];
//        }
//        unSort[start] = pivot;
//        return start;
//    }


}
