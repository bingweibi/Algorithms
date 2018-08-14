import java.util.*;

/**
 * @author bibingwei
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//堆数
        int[] Ai = new int[n];//苹果堆
        int[] sumAi = new int[n];
        for (int i = 0; i < n; i++) {
            Ai[i] = sc.nextInt();
        }
        int counts = sc.nextInt();//询问次数
        int[] Qi = new int[counts];//想查询的苹果在那一堆
        for (int i = 0; i < counts; ++i) {
            Qi[i] = sc.nextInt();
        }
        sumAi[0] = Ai[0];
        for (int i = 1; i < n; ++i) {
            sumAi[i] = Ai[i] + sumAi[i - 1];
        }
        Search(Qi, sumAi);
    }

    private static void Search(int[] qi, int[] sumAi) {

        for (int aQi : qi) {
            int result = Arrays.binarySearch(sumAi, aQi);
            if (result >= 0) {
                System.out.println(result+1);
            } else {
                System.out.println(-result);
            }
        }
    }
}


