package LeetCode;

public class Num125 {
    public static void main(String[] args) {
        System.out.println(new Num125().isPalindrome("race a car"));
    }
    public boolean isPalindrome(String s) {
        if (s.length() ==0){
            return true;
        }

        char[] temp = s.toUpperCase().toCharArray();
        int i=0,j=temp.length-1;
        while (i<=j){
            while (!numorword(temp[i])&& i<j){
                i++;
            }
            while (!numorword(temp[j])&& i<j){
                j--;
            }
            if (temp[i]!=temp[j]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean numorword(char c) {
        boolean temp = true;
        if (c<48 || (c>57 && c<65) || c>90){
            temp = false;
        }
        return temp;
    }
}
