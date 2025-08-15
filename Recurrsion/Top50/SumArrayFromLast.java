public class SumArrayFromLast {

    // Recursive function to sum array from last index
    public static int sumArray(int[] arr, int index) {
        if (index == 0) return arr[0];              // base case
        return arr[index] + sumArray(arr, index - 1); // recursive sum
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        System.out.println("Sum of array: " + sumArray(arr, n - 1));
    }
}
