package LeetCode;

public class Num367 {

    public static void main(String[] args) {
        System.out.println(new Num367().isPerfectSquare(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num / i; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
