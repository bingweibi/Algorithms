package LeetCode;

import java.awt.geom.FlatteningPathIterator;

public class Num231 {
    public static void main(String[] args) {
        System.out.println(new Num231().isPowerOfTwo(1073741825));
    }
    public boolean isPowerOfTwo(int n) {
        int sum = 2;
        if (n==1 || n==2){
            return true;
        }
        if (n%4!=0){
            return false;
        }
        while (sum < n){
            sum *= 2;
        }
        return sum == n;
    }
}
