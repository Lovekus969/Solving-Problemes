public class FactorialRecursive {

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1; // base case 4x3x2x1x0 where at the end it hits base case so 4x3x2x1x1 = 24
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
