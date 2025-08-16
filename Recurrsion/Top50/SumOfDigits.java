public class SumOfDigits {

    // Recursive method to find sum of digits
    public static int sumOfDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Last digit + sum of remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        int result = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
    }
}
