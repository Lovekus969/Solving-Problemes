public class FibonacciLinear {

    public static void main(String[] args) {
        int n = 10;
        int[] fib = new int[n + 1]; // 1-based indexing

        // Base cases
        fib[1] = 1;
        if (n > 1) fib[2] = 1;

        // Linear tabulation (fill DP table)
        for (int i = 3; i <= n; i++) fib[i] = fib[i - 1] + fib[i - 2];

        // Print sequence in one line
        for (int i = 1; i <= n; i++) System.out.print(fib[i] + " ");
    }
}
