public class Tsum {

    public static boolean TargetSum(int arr[], int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Base Case:
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;  // If sum is 0, we can always make it by taking no elements
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                int v = arr[i - 1];

                // Include current element if it's not larger than j
                if (v <= j) {
                    dp[i][j] = dp[i - 1][j - v] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
         print(dp);
        return dp[n][sum];
    }
    public static int countSubsets(int[] arr, int sum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Base case
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1; // 1 way to make sum = 0 (empty subset)
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
              System.out.print(" "+dp[i][j]);  
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 3};
        int sum = 10;
        System.out.println("Total subsets with sum " + sum + ": " + countSubsets(arr, sum));
    
        System.out.println("Subset with target sum exists? " + TargetSum(arr, sum));
       
    }
}
