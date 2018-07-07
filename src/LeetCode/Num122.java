package LeetCode;

public class Num122 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(new Num122().maxProfit(prices));
    }
    public int maxProfit(int[] prices) {

        int max = 0;
        for (int i=1;i<prices.length;i++){
            max += prices[i] > prices[i-1] ? prices[i]-prices[i-1]:0;
        }
        return max;
    }
}
