
public class Casting{

    // Function to perform division of integer and double
    public static void performDivision() {
        int num1 = 10;
        double num2 = 4.5;
        
        // Division - int is automatically promoted to double
        double result = num1 / num2;
        
        System.out.println("Division (int / double): " + result); // Output: 2.2222222222222223
    }

    // Function to perform addition of integer and double
    public static void performAddition() {
        int num1 = 10;
        double num2 = 3.5;

        // Addition - int is automatically promoted to double
        double result = num1 + num2;
        
        System.out.println("Addition (int + double): " + result); // Output: 13.5
    }

    // Function to perform subtraction of float and integer
    public static void performSubtraction() {
        float num1 = 8.5f;
        int num2 = 3;

        // Subtraction - int is promoted to float
        float result = num1 - num2;
        
        System.out.println("Subtraction (float - int): " + result); // Output: 5.5
    }

    // Function to perform addition and type casting explicitly
    public static void performExplicitCasting() {
        byte num1 = 10;
        int num2 = 20;

        // Explicit type casting - byte will be promoted to int and result is stored in int
        int result = num1 + num2;
        
        System.out.println("Explicit Casting (byte + int): " + result); // Output: 30
    }

    // Function to show casting issue with boolean (compile-time error)
    public static void performBooleanOperation() {
        int num1 = 10;
        boolean flag = true;

        // This will give a compile-time error
        // int result = num1 / flag; // Error: incompatible types: boolean cannot be converted to int
        System.out.println("Boolean cannot be used in arithmetic operations.");
    }

    // Function to perform multiplication of int and double with implicit casting
    public static void performMultiplication() {
        int num1 = 4;
        double num2 = 2.5;
        
        // Multiplication - int is promoted to double
        double result = num1 * num2;
        
        System.out.println("Multiplication (int * double): " + result); // Output: 10.0
    }

    // Function to handle division by zero with casting
    public static void handleDivisionByZero() {
        int num1 = 5;
        int num2 = 0;

        // Division by zero results in infinity when dealing with double or float
        double result = (double) num1 / num2; // Cast one operand to double
        System.out.println("Division by zero with double casting: " + result); // Output: Infinity
    }

    // Function to demonstrate casting from larger types to smaller types
    public static void performNarrowingCasting() {
        double num1 = 9.78;
        
        // Narrowing casting - casting from double to int (decimal is truncated)
        int result = (int) num1; // Explicit cast is needed from double to int
        
        System.out.println("Narrowing Casting (double to int): " + result); // Output: 9
    }

    // Function to show arithmetic operations on larger data types like long and float
    public static void performLongFloatOperations() {
        long num1 = 10000000000L;
        float num2 = 5.5f;
        
        // float is promoted to double, and long is promoted to double during operations
        double result = num1 + num2;
        
        System.out.println("Addition of long and float: " + result); // Output: 10000000005.5
    }

    // Main method to call all functions and see the results
    public static void main(String[] args) {
        // Calling all the functions
        performDivision();
        performAddition();
        performSubtraction();
        performExplicitCasting();
        performBooleanOperation();
        performMultiplication();
        handleDivisionByZero();
        performNarrowingCasting();
        performLongFloatOperations();
    }
}
