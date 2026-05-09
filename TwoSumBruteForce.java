import java.util.Scanner;

public class TwoSumBruteForce {

    // Brute force method
    public static int power(int base, int exponent) {

        int result = 1;

        // multiply base exponent times
        for(int i = 0; i < exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int ans = power(base, exponent);

        System.out.println(base + "^" + exponent + " = " + ans);

        sc.close();
    }
}
