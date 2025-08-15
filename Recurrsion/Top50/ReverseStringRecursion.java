public class ReverseStringRecursion {

    // Recursive function to print reverse
    public static void printReverse(String str, int index) {
        // Base case: if index is less than 0, stop
        if (index < 0) {
            return;
        }

        // Print the current character
        System.out.print(str.charAt(index));

        // Recursive call for the previous character
        printReverse(str, index - 1);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Original String: " + input);
        System.out.print("Reversed String: ");
        printReverse(input, input.length() - 1);
    }
}
