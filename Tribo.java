public class Tribo{
    public static int tribonnacci(int n ){
        //base case 
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        //intialise dp
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        //now call the dp caus we alredy have the values abd then we will try to call them into the function priperly
        for(int i=3;i<=n;i++){
            dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(" here is the ans "+ tribonnacci(n));
    }
}