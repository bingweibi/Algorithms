
import java.util.*;

public class BeikeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt(),result = 0;
        int[] count = new int[sum];
        for (int i=0;i<sum;i++){
            count[i] = sc.nextInt();
        }
        Arrays.sort(count);
        for (int i=1;i<sum;i++){
            result += count[i];
        }
        System.out.println(result);
    }
}