package LeetCode;

import java.sql.SQLOutput;

public class Num459 {
    public static void main(String[] args) {
        System.out.println(new Num459().repeatedSubstringPattern("ababab"));
    }
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        String temp;
        boolean flag = false;
        for (int i=1;i<=len/2;i++){
            temp = s.substring(0,i);
            for (int j=i;j<len;j += i){
                if ( j+i<=len && s.substring(j, j + i).equals(temp)){
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        return flag;
    }
}
