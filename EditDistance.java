public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Base case: converting to/from empty strings
        for (int i = 0; i <= m; i++) dp[i][0] = i; // delete all characters
        for (int j = 0; j <= n; j++) dp[0][j] = j; // insert all characters

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters match, take diagonal (no operation)
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // If not same: choose the best of Insert, Delete, Replace
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1], // Replace
                        Math.min(
                            dp[i - 1][j],   // Delete
                            dp[i][j - 1]    // Insert
                        )
                    );
                }
            }
        }

        return dp[m][n]; // final result: full conversion
    }
}
