import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        // Edge case: if array is empty
        if (strs == null || strs.length == 0) return "";

        // Sort the array
        Arrays.sort(strs);

        // Compare first and last elements in the sorted array
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] != last[i]) break;
            result.append(first[i]);
        }

        return result.toString();
    }
}
