import java.util.Scanner;

/**
 * @author bibingwei
 */
public class OfferTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] out = new int[k];
        int[] in = new int[k];
        int count = 0;
        int max = 0, min = 0, max_idx = 0, min_idx = 0;
        for(int i = 0; i < k; i++) {
            find_max_and_min(a, n, max, max_idx, min, min_idx);
            if (max - min < 1){
                break;
            }
            out[i] = max_idx;
            in[i] = min_idx;
            a[max_idx]--;
            a[min_idx]++;
            count++;
        }
        find_max_and_min(a, n, max, max_idx, min, min_idx);
        System.out.println(max-min + " " + count);
        for(int i = 0; i < count; i++){
            System.out.println(out[i]+1 +" "+ in[i]+1);
        }
    }

    static void find_max_and_min(int a[], int len, int max, int max_idx, int min, int min_idx) {
        max_idx = min_idx = 0;
        max = min = a[0];
        for(int i = 1; i < len; i++) {
            if (max < a[i])
            {
                max = a[i];
                max_idx = i;
            }
            if (min > a[i])
            {
                min = a[i];
                min_idx = i;
            }
        }
    }
}
