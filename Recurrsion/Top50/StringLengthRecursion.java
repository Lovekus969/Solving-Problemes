public class StringLengthRecursion {

    // Recursive method to find length of a string
    public static int findLength(String str) {
        // Base case: if string is empty, length is 0
        if (str.equals("")) {
            return 0;
        }
        // Count 1 for the first character + recursively count the rest
        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        String text = "Hello World!";
        int length = findLength(text);
        System.out.println("Length of the string: " + length);
    }
}
