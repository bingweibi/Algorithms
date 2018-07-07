package Jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个数组A[0,1,...,n-1],
 * 请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
public class Num51 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        System.out.println(new Num51().multiply(A));
    }
    public int[] multiply(int[] A) {
        int temp= 0;
        List<Integer> list = new ArrayList<Integer>();
        int[] b = new int[A.length];
        for (int i=0;i<A.length;i++){
            list.add(A[i]);
            b[i] = 1;
        }
        while (temp<A.length){
            for (int i=0;i<temp;i++){
                b[temp] *= A[i];
            }
            for (int i=temp+1;i<A.length;i++){
                b[temp] *= A[i];
            }
            temp++;
        }

        return b;
    }
}
