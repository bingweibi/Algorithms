package ToOffer;

/**
 * @author bibingwei
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Num07 {
    public int Fibonacci(int n) {
        int n1 = 1,n2 =1,result = 0;
        if (n <= 1){
            return n;
        }
        if (n==2){
            return 1;
        }
        for (int i=3;i <= n;i++){
            result = n1+n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }
}
