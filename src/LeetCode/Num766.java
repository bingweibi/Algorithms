package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Num766 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(new Num766().isToeplitzMatrix(matrix));
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean flag = true;
        List<Integer> list = new ArrayList<>();
        int wid = matrix.length,len = matrix[0].length;
        if (wid==1 ||len ==1){
            return true;
        }
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < len; j++) {
                list.add(aMatrix[j]);
            }
        }
        for (int i=0;i<(wid-1)*len;i++){
            if ((i+1)%len == 0&&i!=0){
                continue;
            }
            if (!list.get(i).equals(list.get(len + 1 + i))){
                flag = false;
            }
        }
        return flag;
    }
}
