import java.util.Stack;

public class StackArrayReverse {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all elements onto the stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // Step 2: Pop from stack and overwrite original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        // Output result
        System.out.println("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
