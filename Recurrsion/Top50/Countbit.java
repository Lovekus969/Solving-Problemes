public class Countbit{
public static int countSetBits(int n) {
    // Base case: when number becomes 0
    if (n == 0) {
        return 0;
    }
    // Take last bit + recursive call on remaining bits
    return (n & 1) + countSetBits(n >> 1);
}

public static void main(String[] args) {
    int n = 13; // binary = 1101
    System.out.println("Set bits in " + n + " = " + countSetBits(n));
 }
}
