public class NumberOfIslands {

    // DFS function to mark connected land as visited
    public static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // Mark current cell as visited
        grid[i][j] = '0';

        // Visit all 4 neighbors
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }

    // Function to count islands
    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    // Main method to run example
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0'},
            {'1', '0', '0', '1'},
            {'0', '1', '1', '1'},
            {'1', '0', '0', '1'}
        };

        int result = numIslands(grid);
        System.out.println("Number of islands: " + result);
    }
}
