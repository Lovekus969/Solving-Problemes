import java.util.Arrays;

public class Matrix {

    public static int mcm(int arr[], int i, int j, int dp[][]) {
        // base case
        if (i == j) {
            return 0;
        }

        if (dp[i][j] != -1) { // already calculated
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k, dp);
            int cost2 = mcm(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans, finalCost);
        }

        dp[i][j] = ans; // store the result
        return dp[i][j];
    }
public static int matrixChainMultiplication(int[] p) {
    int n = p.length - 1; // number of matrices
    int[][] dp = new int[n][n];

    // initialize diagonal with 0
    for (int i = 0; i < n; i++) {
        dp[i][i] = 0;
    }

    // l = chain length
    for (int len = 2; len <= n; len++) {
        for (int i = 0; i <= n - len; i++) {
            int j = i + len - 1;
            dp[i][j] = Integer.MAX_VALUE;

            for (int k = i; k < j; k++) {
                int cost = dp[i][k] + dp[k+1][j] + p[i] * p[k+1] * p[j+1];
                dp[i][j] = Math.min(dp[i][j], cost);
            }
        }
    }

    return dp[0][n-1]; // minimum cost to multiply matrices from A1 to An
}

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        int dp[][] = new int[n][n];

        // initialize dp array with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("Minimum number of multiplications: " + matrixChainMultiplication(arr));
    }
}
