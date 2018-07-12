package LeetCode;

/**
 * @author bibingwei
 *  *
 */
public class Num746 {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(new Num746().minCostClimbingStairs(cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length+1;
        int[] dp = new int[len];
        dp[0] =0;
        dp[1] =0;
        for (int i=2;i<len;i++){
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[len-1];
    }
}
