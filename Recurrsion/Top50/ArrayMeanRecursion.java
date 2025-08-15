public class ArrayMeanRecursion {

    // Function to find sum recursively
    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;           // base case
        return arr[n - 1] + sumArray(arr, n - 1); // recursive sum
    }

    // Function to find mean
    public static double meanArray(int[] arr, int n) {
        int sum = sumArray(arr, n);     // get sum recursively
        return (double) sum / n;        // divide by number of elements
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        System.out.println("Sum: " + sumArray(arr, n));
        System.out.println("Mean: " + meanArray(arr, n));
    }
}
