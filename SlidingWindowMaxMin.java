public class SlidingWindowMaxMin {

    // Function to find max sum of subarray of size k
    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;

        // Sum first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    // Function to find min sum of subarray of size k
    public static int minSum(int[] arr, int k) {
        int windowSum = 0;

        // Sum first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int minSum = windowSum;

        // Slide window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            minSum = Math.min(minSum, windowSum);
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 6, 4, 2};
        int k = 3;

        int maximum = maxSum(arr, k);
        int minimum = minSum(arr, k);

        System.out.println("Max sum of subarray of size " + k + " = " + maximum);
        System.out.println("Min sum of subarray of size " + k + " = " + minimum);
    }
}
