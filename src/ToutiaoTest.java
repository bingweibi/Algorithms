import java.util.*;

public class ToutiaoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int n = sc.nextInt();//长度n

        int[] ai = new int[n];
        int[] bi = new int[n];
        for (int i=0;i<n;i++){
            ai[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            bi[i] = sc.nextInt();
        }
        count = findCount(ai,bi,n);
        System.out.println(count);
    }

    private static int findCount(int[] ai, int[] bi,int len) {
        int count =0,buchangg = 1;
        while (buchangg <= len){
            for (int i=0;i + buchangg <= len;i++){
                int[] aiCopy = copy(ai,i,i+buchangg);
                Arrays.sort(aiCopy);
                int[] biCopy = copy(bi,i,i+buchangg);
                Arrays.sort(biCopy);
                if (aiCopy[buchangg-1] < biCopy[0]){
                    count++;
                }
            }
            buchangg += 1;
        }
        return count;
    }

    private static int[] copy(int[] ai, int i, int i1) {
        int[] copy = new int[i1-i];
        if (i1 - i >= 0) {
            System.arraycopy(ai, i, copy, 0, i1 - i);
        }
        return copy;
    }
}