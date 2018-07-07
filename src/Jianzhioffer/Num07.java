package Jianzhioffer;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 * @author bibingwei
 */
public class Num07 {
    public static void main(String[] args) {
        System.out.println(new Num07().Fibonacci(5));
    }
    public int Fibonacci(int n) {
        int f1=0,f2=1,result=0;
        if (n == 0){
            return 0;
        }else if (n ==1){
            return f2;
        }
        for (int i = 2; i<=2; i++){
            result = f1+f2;
            f1=f2;
            f2=result;
        }
        return result;
    }
}
