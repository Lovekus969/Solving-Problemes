package Q1_01_Is_Unique;

public class QuestionA {

    // Function to check if all characters are unique
    public static boolean checkIfUnique(String str) {
        if (str.length() > 128) {
            return false; // Too many characters for ASCII set
        }

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i); // Get ASCII value of character

            if (char_set[val]) {
                return false; // Duplicate found
            }

            char_set[val] = true; // Mark as seen
        }

        return true; // All characters were unique
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello
