public class DecimalToBinary {

    // Function to convert decimal to binary using recursion
    public static void decimalToBinary(int n) {
        if (n == 0) return;              // base case

        decimalToBinary(n / 2);          // recursive call on quotient
        System.out.print(n % 2);         // print remainder after recursion
    }

    public static void main(String[] args) {
        int decimalNumber = 25;

        System.out.print("Binary of " + decimalNumber + " is: ");
        if (decimalNumber == 0) {
            System.out.print(0);         // handle 0 explicitly
        } else {
            decimalToBinary(decimalNumber);
        }
    }
}
