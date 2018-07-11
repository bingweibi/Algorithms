package LeetCode;

import java.util.Arrays;

public class Num832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A[0].length,wid = A.length;
        for (int i=0;i<len;i++){
            for (int j=0,k=wid-1;j<=k;j++,k--){
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
            }
        }
        for (int i=0;i<len;i++) {
            for (int j = 0; j < wid; j++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
