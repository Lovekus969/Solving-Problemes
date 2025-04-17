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
            return dp[n][W];
    }

    public static void main(String[] args){
        int val[]= { 15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        System.out.println(" "+ unboundedKnap(val, wt, 7));
    }
}