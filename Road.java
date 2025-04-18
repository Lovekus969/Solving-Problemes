
public class Road{
    public static int maxProfit( int length[] , int prices[], int TL){
        // base case or initalisation 
        int n = length.length;
        int dp[][] = new int [n+1][TL+1];
        // what if in my dp array i have no prices and i can say if in my bag no space so no proft 
        for( int i=0 ; i< n+1;i++){
            for( int j=0; j<TL+1; j++){
                if( i==0|| j==0){
                    dp[i][j] =0;
                }
            }
        }
        // after initialise i will cheack for the dp array 
        for( int i=1; i< n+1; i++){
            for( int j=1; j<TL+1;j++){
                //cheack for validity 
                if(length[i-1]<=j){ // valid 
                dp[i][j] = Math.max(prices[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][TL];
    }











   public static int lcs(String str1, String str2, int n , int m){
    if( n==0||m==0){
        return 0;
    }
    if(str1.charAt(n-1)==str2.charAt(m-1)){
        return lcs(str1, str2, n-1, m-1)+1;
    }else{
        //different case then decrese size of one and keep secondas it is and second time keep first as is and decrese second 
        int ans1 = lcs(str1, str2, n-1,  m);
        int ans2 = lcs(str1, str2, n, m-1);
        return Math.max(ans1, ans2);

    }

   }

    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        System.out.println(" is "+ lcs(str1, str2, n, m));

        // int length[] = { 1,2,3,4,5,6,7,8};
        // int prices[] = { 1,5,8,9,10,17,17,20};
        // int TL =8;
        // System.out.println(" Max road Length with max profit is : "+ maxProfit(length, prices, TL));
    }
}