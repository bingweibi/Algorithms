package sort;

/**
 * @author bibingwei
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] unSort = {2,5,6,4,1,3,8,7,9};
        int gap =1,len = unSort.length;
        while (gap<len/3){
            gap = gap * 3 +1;
        }
        for (; gap>0; gap/=3){
            for (int i=gap;i<len;i++){
                for (int j=i-gap;j>=0 && unSort[j]>unSort[j+gap];j-=gap){
                    int temp = unSort[j];
                    unSort[j] = unSort[j+gap];
                    unSort[j+gap] = temp;
                }
            }
        }

        for (int anUnSort : unSort) {
            System.out.print(anUnSort + " ");
        }
    }
}
