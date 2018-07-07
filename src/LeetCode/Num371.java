package LeetCode;

/**
 * @author bibingwei
 * 不使用运算符 + 和-，计算两整数a 、b之和。
 */
public class Num371 {
    public static void main(String[] args) {
        System.out.println(new Num371().getSum(-2,-1));
    }
    public int getSum(int a, int b) {
        int sum = 0, carry = 0;
        while (b != 0) {
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}
