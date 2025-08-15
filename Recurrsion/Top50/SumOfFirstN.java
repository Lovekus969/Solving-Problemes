public class SumOfFirstN {

    // Recursive function to calculate sum of first n numbers
    public static int sum(int n) {
        if (n == 0) return 0;       // base case
        return n + sum(n - 1);      // recursive call
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Sum of first " + n + " numbers: " + sum(n));
    }
}
