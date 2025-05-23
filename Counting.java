
public class Counting{
    // create a funtion which can give me the count of total ouccerence 
    public static void countOccurence(int nums[]){
        // run  a  loop througth it 
        for( int i=0 ; i< nums.length;i++){
              int count =0;
              for( int j=0; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
              }
                System.out.println( nums[i]+ "--> "+count);
        }
        
    }

    public static void main(String[] args) {
        int nums[] = { 1,2,2,3,1,1};
        countOccurence(nums);
    }
}