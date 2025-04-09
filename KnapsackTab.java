public class KnapsackTab{
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0; j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
              
            }
             System.out.println();
        }
    }

// make a function here for the knapsack with using table repersentation 
public static int knapsackTable(int val[],int wt[],int W){
    //base case 
    int n = val.length;
    int dp[][]=new int[n+1][W+1];
    //intialsie the dp to first row and first col to 0 
    for( int i=0;i<dp.length;i++){
            //first col set to 0  
            dp[i][0]=0;
     } for (int j=0;j<dp[0].length;j++) {
        //set first row to 0
            dp[0][j] =0;
         
     }
     //step 2 iterate over the no of item with respect to there weight 
     for(int i=1;i<n+1;i++){
        for(int j=1;j<W+1;j++){
            int v = val[i-1]; //ith item 
            int w = wt[i-1];//ith weight 
            // now cheack if the weight is under then its valid 
            //if valid then cheack for the valid and non valid conditions
            if(w<=j){//valid
            int incProf =val[i-1]+ dp[i-1][j-w];//include profit 
            int excProf = dp[i-1][j];
            dp[i][j]=Math.max(incProf, excProf);
           

            }else{
                //what to do just exclude it 
            dp[i][j]= dp[i-1][j];
            }
        }
     }
      print(dp);
return dp[n][W];
   

}
    public static void main(String[] args) {
        //intialise 
        int val[]={15,14,10,45,30};
        int wt[]= { 2,5,1,3,4};
        int W = 7;
        
        //intialise the 2D array of dynnamic program with -1 
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int result =knapsackTable(val, wt, W);
        System.out.println("Result is "+result);
       
    }

}