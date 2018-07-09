package LeetCode;

public class Num342 {
    public static void main(String[] args) {
        System.out.println(new Num342().isPowerOfFour(1162261468));
    }
    public boolean isPowerOfFour(int num) {
        int temp = 1;
        if (num == 1 || num == 4){
            return true;
        }
        if (num % 16 !=0){
            return false;
        }
        while (temp < num){
            temp *= 4;
        }
        return temp == num;
    }
}
