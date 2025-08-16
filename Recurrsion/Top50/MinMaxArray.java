public class MinMaxArray {

    // Recursive method to find minimum
    public static int findMin(int[] arr, int n) {
        // Base case: if only one element, return it
        if (n == 1) {
            return arr[0];
        }
        // Recursive call to find minimum of first n-1 elements
        int minRest = findMin(arr, n - 1);
        // Compare last element with min of rest
        return Math.min(arr[n - 1], minRest);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int min = findMin(arr, arr.length);
        System.out.println("Minimum element is: " + min);
    }
}
