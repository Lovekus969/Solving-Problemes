import java.util.Arrays;

public class MaxUsingSort {
    public static void main(String[] args) {
        int[] nums = {4, 7, 1, 9, 3};

        Arrays.sort(nums);  // O(n log n)
        int max = nums[nums.length - 1];  // O(1)

        System.out.println("Max element: " + max);
    }
}
