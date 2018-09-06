package sort;

/**
 * @author bibingwei
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于取出的元素，将该元素移到下一位置
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到该位置后
 * 重复步骤2~5
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] unSort = {1,9,3,2,5,8,4};
        System.out.println(new InsertSort().solution(unSort));
    }
    public int[] solution(int[] unSort){
        int len = unSort.length;
        for (int i=1;i<len;i++){
            for (int j=i;j>0;j--){
                if (unSort[j]<unSort[j-1]){
                    int temp = unSort[j-1];
                    unSort[j-1] = unSort[j];
                    unSort[j] = temp;
                }
            }
        }
        return unSort;
    }
}
