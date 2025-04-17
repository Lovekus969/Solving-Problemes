public class CoinChangeWays {
    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Base case 1: sum == 0 → 1 way (pick nothing)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Base case 2: no coins (i == 0) → 0 ways to form positive sum
        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    // Include + Exclude
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    // Exclude only
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 4;
        System.out.println("Total ways to make change: " + coinChange(coins, sum));
    }
}
