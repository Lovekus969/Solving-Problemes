import java.util.*;

public class MostFreq {
    public static void main(String[] args) {
        int nums[] = {1, 100, 1, 200, 1, 100};
        int key = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // Step 1: Count targets that come right after key
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1]; // use i+1 to get the next element
                map.put(target, map.getOrDefault(target, 0) + 1);
            }
        }

        // Step 2: Find the target with the highest frequency
        int maxFreq = 0;
        int mostFrequent = -1;
//run a for each loop through the set and get the values 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // Step 3: Print the result once
        System.out.println("Most frequent target after key " + key + " is: " + mostFrequent);
    }
}
