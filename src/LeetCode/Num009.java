package LeetCode;

public class Num009 {
    public static void main(String[] args) {
        System.out.println(new Num009().isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        boolean flag = true;
        char[] temp = String.valueOf(x).toCharArray();
        for (int i = 0,j = temp.length - 1; j >temp.length/2-1;i++, j--) {
            if (temp[i] != temp[j]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
