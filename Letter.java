import java.util.*;

public class Letter {
    // Create a function to get all possible combinations of letters
    public void rec(int i, String digits, String map[], String res, List<String> ans) {
        if (i == digits.length()) {
            ans.add(res);
            return;
        }
        char ch = digits.charAt(i);
        int num = ch - '0';

        String st = map[num];
        for (int j = 0; j < st.length(); j++) {
            rec(i + 1, digits, map, res + st.charAt(j), ans);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        // Base case
        if (digits.length() == 0) {
            return ans;
        }
        String map[] = { " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        rec(0, digits, map, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        Letter letter = new Letter(); // Create an instance of the Letter class
        String digits = "23"; // Example input
        List<String> ans = letter.letterCombinations(digits); // Call the method
        System.out.println("Combinations: " + ans); // Print the result
    }
}
