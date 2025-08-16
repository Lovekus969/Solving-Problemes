public class Fibonacci {

    // Recursive Fibonacci
    public static int fib(int n) {
        // Base case: if n is 1 or 2, return 1
        if (n == 1 || n == 2) {
            return 1;
        }
        // Recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // first 10 Fibonacci numbers

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
