
import java.util.*;


Public class GFG {
    // Prints numbers from N to 1
    static void printNos(int n)
    {
        if (n > 0) {
            System.out.print(n + " ");
            printNos(n - 1);
        }
        return;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 10;
        printNos(n);
    }
}
