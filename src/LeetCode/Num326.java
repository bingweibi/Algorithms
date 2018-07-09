package LeetCode;

public class Num326 {
    public static void main(String[] args) {
        System.out.println(new Num326().isPowerOfThree(2147483647));
    }
    public boolean isPowerOfThree(int n) {
        int temp = 1;
        if (n == 1 || n==3){
            return true;
        }
        if (n % 9 !=0){
            return false;
        }
        while (temp < n){
            temp *= 3;
        }
        return temp == n;
    }
}
