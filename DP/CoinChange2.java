public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int c:coins) {
            for (int j = c; j <= amount; j++) {
                dp[j] += dp[j - c];
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        CoinChange2 coinChange2 = new CoinChange2();
        int amount = 5;
        int[] coins = {1, 2, 5};
        int result = coinChange2.change(amount, coins);
        System.out.println("Number of combinations: " + result);
    }
}
