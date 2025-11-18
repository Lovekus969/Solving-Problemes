import java.util.HashMap;
import java.util.Map;

public class TwoSummition{

    // Function to solve the Two Sum problem
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement already exists in the map
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            // Insert current number and its index
            map.put(nums[i], i);
        }

        // If no solution (not needed for LeetCode)
        return new int[]{};
    }

    public static void main(String[] args) {
        // Example inputs
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Solve
        int[] result = twoSum(nums, target);

        // Print results
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
    }
}
