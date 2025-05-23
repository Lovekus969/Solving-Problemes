import java.util.*;
public class Counting{
    // create a funtion which can give me the count of total ouccerence 
    // public static void countOccurence(int nums[]){
    //     // run  a  loop througth it 
    //     for( int i=0 ; i< nums.length;i++){
    //           int count =0;
    //           for( int j=0; j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 count++;
    //             }
    //           }
    //             System.out.println( nums[i]+ "--> "+count);
    //     }
        
    // }


    public static void countOccurrence(int nums[]) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count occurrences using classic for-loop
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Step 2: Print using iterative loop
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " --> " + value);
        }
    }


    public static void main(String[] args) {
        int nums[] = { 1,2,2,3,1,1};
        countOccurrence(nums);
    }
}