public class MaxArray {

    // Recursive method to find maximum
    public static int findMax(int[] arr, int n) {
        // Base case: if only one element, return it
        if (n == 1) {
            return arr[0];
        }
        // Recursive call to find max of first n-1 elements
        int maxRest = findMax(arr, n - 1);
        // Compare last element with max of rest
        return Math.max(arr[n - 1], maxRest);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int max = findMax(arr, arr.length);
        System.out.println("Maximum element is: " + max);
    }
}
