package LeetCode;

public class Num202 {
    public static void main(String[] args) {
        System.out.println(new Num202().isHappy(11));
    }

    public boolean isHappy(int n) {
        if (n == 0){
            return true;
        }
        int sum = n;
        while (sum >= 10){
            int temp = 0;
            while (sum !=0){
                temp += (sum%10)*(sum%10);
                sum = sum/10;
            }
            sum = temp;
        }
        return sum == 1 || sum == 7;
    }
}
