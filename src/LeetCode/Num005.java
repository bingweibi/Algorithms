package LeetCode;

public class Num005 {

    public static void main(String[] args) {
        System.out.println(new Num005().longestPalindrome("babbad"));
    }

    public String longestPalindrome(String s) {
        int len = s.length(),currentMaxlen = Integer.MIN_VALUE,j = len-1;
        String temp ="";
        if (s.length() < 2){
            return s;
        }
        for (int i=0;i<len;i++){
            int tempi = i;
            for (;j>=i;j--){
                while (s.charAt(i) != s.charAt(j)){
                    j--;
                }
                while(s.charAt(i) == s.charAt(j) && i<=j ){
                    currentMaxlen = Math.max(currentMaxlen,j-i);
                    i++;j--;
                }
                j++;
                i = tempi;
            }
            if (i>j){
                temp = s.substring(tempi,currentMaxlen+1);
                break;
            }else {
                j=len-1;i = tempi;
            }
        }
        return temp;
    }
}
