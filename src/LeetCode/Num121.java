package LeetCode;

public class Num121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,2,1};
        System.out.println(new Num121().maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i=0;i<prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                if (prices[i] > prices[j]){

                }else {
                    max = Math.max(max,prices[j]-prices[i]);
                }
            }
        }
        return max;
    }
}
