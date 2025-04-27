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

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        int dp[][] = new int[n][n];

        // initialize dp array with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("Minimum number of multiplications: " + mcm(arr, 1, n - 1, dp));
    }
}
