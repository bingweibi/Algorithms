package ToOffer;

/**
 * @author bibingwei
 *
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Num01 {
    public static boolean find(int[][] matrix, int number) {
        int len = matrix.length,width = matrix[0].length;
        int i=0,j=width-1;
        while (i<len && j>=0){
            if (matrix[i][j] > number){
                j--;
            }else if (matrix[i][j] < number){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
