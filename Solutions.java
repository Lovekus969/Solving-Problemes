import java.util.*;

class Solutions {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> seen = new HashSet<>();
        int missing = -1;
        int repeating = -1;
        int n = grid.length * grid[0].length; // total elements

        // Find repeating number
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = grid[i][j];
                if (seen.contains(num)) {
                    repeating = num;
                } else {
                    seen.add(num);
                }
            }
        }

        // Find missing number
        for (int i = 1; i <= n; i++) { // loop inclusive of n
            if (!seen.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
}
