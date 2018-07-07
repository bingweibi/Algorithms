package LeetCode;

public class Num069 {
    public static void main(String[] args) {
        System.out.println(new Num069().mySqrt(18));
    }
    public int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }
}
