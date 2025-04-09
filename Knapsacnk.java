public class Knapsacnk{

        public static int  knapsack(int val[],int wt[],int Total_weight,int n,int dp[][]){
            //base case 
            if(n==0|| Total_weight==0){
                return 0;
            }
            //cheack for the valid and not valid conditions 
            //becasue in step 1 i make my dp 2 dimanentinal to be -1 for all now its time to cheack for those which are not -1
            if(dp[n][Total_weight]!=-1){
                return dp[n][Total_weight];
            }
            //cheack for the conditions 
            if(wt[n-1]<=Total_weight){
                //here if its vaalid just two conditions either include or exclude
                int ans1 = val[n-1]+knapsack(val, wt, Total_weight-wt[n-1], n-1, dp);
                //or exclude 
                int ans2 = knapsack(val, wt, Total_weight, n-1, dp);
                dp[n][Total_weight]=Math.max(ans1, ans2);
                return dp[n][Total_weight];
            }else{
                    //only exclude
                dp[n][Total_weight]= knapsack(val, wt, Total_weight, n-1, dp);
                return dp[n][Total_weight];
            }
         }

    public static void main(String[] args) {
         
         int val[]= {15,14,10,45,30};
         int wt[]={2,5,1,3,4};

         int Total_weight = 7;
         int Max_Proft ;  //------ >ans

         int dp[][]=new int[val.length+1][Total_weight+1];
         //intialise this entire dp to -1
         for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    dp[i][j]=-1;
                }
         }
         System.out.println(knapsack(val,wt,Total_weight,val.length,dp));
            
         }

    }

