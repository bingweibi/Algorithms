package LeetCode;

public class Num868 {
    public static void main(String[] args) {
        int[][] A = {{1}};
        new Num868().transpose(A);
    }
    public int[][] transpose(int[][] A) {
        int wid = A.length,len = A[0].length;
        int[][] B = new int[len][wid];

        for (int i=0;i<len;i++){
            for (int j=0;j<wid;j++){
                B[i][j] = A[j][i];
            }
        }
        return B;
    }
}
