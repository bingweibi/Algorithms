package LeetCode;

public class Num070 {
    public static void main(String[] args) {
        System.out.println(new Num070().climbStairs(44));
    }
    public int climbStairs(int n) {
        if (n<2){
            return n;
        }
        int f1 = 1,f2 = 0,sum = 0;
        for (int i=1;i<=n;i++){
            sum = f1+f2;
            f2 =f1;
            f1 = sum;
        }
        return sum;
    }
}
