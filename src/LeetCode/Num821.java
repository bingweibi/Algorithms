package LeetCode;

import java.util.Arrays;

public class Num821 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Num821().shortestToChar("loveleetcode", 'e')));
    }
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        for (int i=0;i<S.length();i++){
            result[i] = shortest(i,S,C);
        }
        return result;
    }

    private int shortest(int i, String s, char c) {
        int i1 = Integer.MAX_VALUE,i2 = Integer.MAX_VALUE;
        for (int j=i;j<s.length();j++){
            if (s.charAt(j) == c){
                i1 = j-i;
                break;
            }
        }
        for (int k=i;k>=0;k--){
            if (s.charAt(k) == c){
                i2 = i-k;
                break;
            }
        }
        return Math.min(i1,i2);
    }
}
