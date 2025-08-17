public class PalindromeCheck {

    // Recursive method to check if string is palindrome
    public static boolean isPalindrome(String str, int left, int right) {  // just like poinetrs paramterised as left and right 
        // Base case: if one or zero characters left, it's a palindrome
        if (left >= right) {
            return true;
        }
        // If mismatch found, it's not a palindrome
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        // Recursive call moving towards the center
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";

        System.out.println(s1 + " is palindrome? " + isPalindrome(s1, 0, s1.length() - 1));
        System.out.println(s2 + " is palindrome? " + isPalindrome(s2, 0, s2.length() - 1));
    }
}
