public class SumOfDigitsRecursion {

    // Recursive method to find sum of digits
    public static int sumOfDigits(int n) {
        // Base case: if number is 0, sum is 0
        if (n == 0) {
            return 0;
        }
        // Last digit (n % 10) + sum of remaining digits (n / 10)
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        int sum = sumOfDigits(num);

        // Print the result
        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}
