public class RecursionBasic {

    // Ascending order: 1 .. n (Head recursion)
    public static void printAscending(int n) {
        if (n <= 0) return;          // Base case
        printAscending(n - 1);       // Recursive call to the function untill it hit the base case 
        System.out.print(n + " ");   //  Yes exactly , Print after recursion -> ascending
    }

    // Descending order: n .. 1 (Tail recursion)
    public static void printDescending(int n) {
        if (n <= 0) return;          // Base case
        System.out.print(n + " ");   // Print before recursion -> descending
        printDescending(n - 1);      // Recursive call
    }

    //  Ascending order using tail-recursive helper
    public static void printAscendingHelper(int n) {
        printFrom(1, n);
    }

    private static void printFrom(int current, int n) {
        if (current > n) return;      // Base case
        System.out.print(current + " ");
        printFrom(current + 1, n);    // Recursive call
    }

    //  Print even numbers from 1 to n
    public static void printEven(int n) {
        if (n <= 0) return;  
        printEven(n - 1);             // Recurse first
        if (n % 2 == 0) System.out.print(n + " "); // Print if even
    }

    //  Print odd numbers from 1 to n
    public static void printOdd(int n) {
        if (n <= 0) return;  
        printOdd(n - 1);  
        if (n % 2 != 0) System.out.print(n + " "); // Print if odd
    }

    // Sum of numbers from 1 to n
    public static int sum1ToN(int n) {
        if (n <= 0) return 0;          // Base case
        return n + sum1ToN(n - 1);     // Recursive sum
    }

    public static void main(String[] args) {
        int n = 99;

        System.out.println(" Ascending order (1 to n):");
        printAscending(n);
        System.out.println();

        System.out.println(" Descending order (n to 1):");
        printDescending(n);
        System.out.println();

        System.out.println(" Ascending with helper:");
        printAscendingHelper(n);
        System.out.println();

    }   
}
