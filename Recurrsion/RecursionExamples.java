public class RecursionExamples {

    // Recursive Factorial Function
    public static int factorial(int n) {
        // Base case: factorial(0) = 1, factorial(1) = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    // Recursive Fibonacci Function
    public static int fibonacci(int n) {
        // Base case: fibonacci(0) = 0, fibonacci(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case: fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Factorial Example
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));

        // Fibonacci Example
        int fibIndex = 7;
        System.out.println("Fibonacci number at index " + fibIndex + " is: " + fibonacci(fibIndex));

        // Optional: print a Fibonacci series
        System.out.print("Fibonacci series up to index " + fibIndex + ": ");
        for (int i = 0; i <= fibIndex; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
