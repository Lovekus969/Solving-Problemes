public class Knap{
    public static int unboundedKnap( int val[], int wt[], int W){
        //declaee
        int n =val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;     //first col when thwre is no wt for all item its gonna be 0 
        }
            for( int j=0 ; j<W+1;j++){
           
                dp[0][j] = 0 ; // if there is no item no matter how much wt its all 0   
        }
        // now run for knapsack unbounded remeber i canuse multiple times
            for( int i=1;i<n+1;i++){
                for( int j=1; j< W+1; j++){
                    if(wt[i-1]<=j){//valid condition then include or exclude 
                        dp[i][j] = Math.max(val[i-1]+dp[i][j- wt[i-1]], dp[i-1][j]);
                    }else{//case for exclude 
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            // Print DP Table
        System.out.println("\nDP Table:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
            return dp[n][W];
    }
    //coin change problem 
    public static int coinChange(int coins[], int sum ){
        int n = coins.length;
        int dp[][]= new int[n+1][sum+1];
        // here initalise for the first col when i have sum 0 i have one way simple gave nothing 
        for( int i=0 ; i< n+1; i++){ // i----> coin 
                dp[i][0] = 1;

        }//second loop for the initialse when i have 0 coin and sum is more than it so 0 ways 
        for( int j=0 ; j< sum+1; j++){
                dp[0][j] = 0;
        }//O(n*sum)
        //here run the main part for the unbounded similar variation 
        for( int i=1; i< n+1; i++){
            for( int j=1; j<sum+1;j++){
               //cheack for validity 
               if(coins[i-1]<=j){
                dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];  // inc + exc
               }else {
                    dp[i][j] = dp[i-1][j];                   
               }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args){
       int coin[] ={ 1,2,3};
       int sum = 4;//ans 4
       System.out.println(" total ways :"+ coinChange(coin, sum));
    }
}