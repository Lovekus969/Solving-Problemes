
import java.util.Arrays;

public class FibonacciDP {

    // 1. Naive Recursion (Slow)
    public static int fibonacciNaive(int n) {
        if (n == 0) return 0;   // Base case 1
        if (n == 1) return 1;   // Base case 2
        return fibonacciNaive(n - 1) + fibonacciNaive(n - 2);
    }

    // 2. Memoization (Top-Down DP)
    public static int fibonacciMemo(int n, int[] dp) {
        if (n == 0) return 0;   // Base case 1
        if (n == 1) return 1;   // Base case 2

        if (dp[n] != -1) return dp[n]; // Already computed

        dp[n] = fibonacciMemo(n - 1, dp) + fibonacciMemo(n - 2, dp);
        return dp[n];
    }

    // 3. Tabulation (Bottom-Up DP)
    public static int fibonacciBottomUp(int n) {
        if (n == 0) return 0;   // Base case 1
        if (n == 1) return 1;   // Base case 2

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

   

    public static void main(String[] args) {
        int n = 10;

        // 1. Naive Recursion
        System.out.println("Naive Recursion: " + fibonacciNaive(n));

        // 2. Memoization (Top-Down DP)
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Memoization (Top-Down DP): " + fibonacciMemo(n, dp));

        // 3. Tabulation (Bottom-Up DP)
        System.out.println("Tabulation (Bottom-Up DP): " + fibonacciBottomUp(n));

     
    }
}
