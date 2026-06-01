public class TwoSumCheck {

    // Function
    public boolean checkForTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int curr = nums[left] + nums[right];

            if (curr == target) {
                return true;
            }

            if (curr > target) {
                right--;
            } else {
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 9};
        int target = 10;

        // Create object
        TwoSumCheck obj = new TwoSumCheck();

        // Call function
        boolean result = obj.checkForTarget(nums, target);

        System.out.println("Target found: " + result);
    }
}
