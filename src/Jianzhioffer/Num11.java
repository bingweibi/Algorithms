package Jianzhioffer;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * @author bibingwei
 */
public class Num11 {
    public static void main(String[] args) {
        System.out.println(""+ new Num11().NumberOf1(7));
    }
    private int NumberOf1(int n) {
        int num = 0;
        while (n!=0){
            ++num;
            n=(n-1)&n;
        }
        return num;
    }
}
