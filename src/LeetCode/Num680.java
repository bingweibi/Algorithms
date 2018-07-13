package LeetCode;

import sun.reflect.generics.tree.Tree;

public class Num680 {
    public static void main(String[] args) {
        System.out.println(new Num680().validPalindrome("deeee"));
    }
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i=0,j= chars.length-1,count = 0,count1=0,l=0,m= chars.length-1;
        while (i<=j){
            if (chars[i] == chars[j]){
                i++;j--;
            }else {
                j--;
                count1++;
            }
        }
        while (l<=m){
            if (chars[l] == chars[m]){
                l++;m--;
            }else {
                l++;
                count++;
            }
        }

        return Math.min(count, count1) < 2;
    }
}
