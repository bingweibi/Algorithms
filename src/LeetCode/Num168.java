package LeetCode;

public class Num168 {
    public static void main(String[] args) {
        System.out.println(new Num168().convertToTitle(701));
    }
    public String convertToTitle(int n) {

        String s = "";
        while (n>0){
            s = (char)(--n%26 + 'A') + s;
            n /= 26;
        }
        return s;
    }
}
