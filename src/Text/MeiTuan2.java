package Text;

import java.util.Scanner;

/**
 * @author bibingwei
 */
public class MeiTuan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int[][] lujin = new int[2][sum];
        for (int i=0;i<sum;i++){
            String[] temp = scanner.nextLine().split(" ");
            for (int j=0;j<2;j++){
                lujin[i][j] = Integer.parseInt(temp[j]);
            }
        }
        for (int i=0;i<sum;i++){

        }

    }
}
