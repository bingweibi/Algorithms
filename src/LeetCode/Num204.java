package LeetCode;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author bibingwei
 *  *
 */
public class Num204 {
    public static void main(String[] args) {
        System.out.println(new Num204().countPrimes(100));
    }
    public int countPrimes(int n) {
        int count=0;
        boolean[] temp = new boolean[n];
        for (int i=2;i*i<n;++i){
            if (!temp[i]){
                for (int j=2;i*j<n;++j){
                    temp[i*j] = true;
                }
            }
        }
        for(int i=2; i<n; i++) {
            if(temp[i] == false) ++count;
        }
        return count;

    }
}
