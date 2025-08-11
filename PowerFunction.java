public class PowerFunction {

    public double myPow(double x, int n) {
        long nLong = n; // Convert n to long to avoid overflow

        // Handle negative exponent
        if (nLong < 0) {
            x = 1 / x;
            nLong = -nLong;
        }

        return power(x, nLong);
    }

    private double power(double x, long n) {
        // Base case
        if (n == 0)
            return 1;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half; // If even
        } else {
            return half * half * x; // If odd
        }
    }

    public static void main(String[] args) {
        PowerFunction solution = new PowerFunction();

        System.out.println("2^10 = " + solution.myPow(2, 10));   // 1024.0
        System.out.println("2^-2 = " + solution.myPow(2, -2));   // 0.25
        System.out.println("3^5 = " + solution.myPow(3, 5));     // 243.0
        System.out.println("5^0 = " + solution.myPow(5, 0));     // 1.0
        System.out.println("2^-3 = " + solution.myPow(2, -3));   // 0.125
    }
}
