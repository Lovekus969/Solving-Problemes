
public class Recursion{
  public static int sumOfDigitsTail(int n, int acc) {
    if (n == 0) return acc;
    return sumOfDigitsTail(n / 10, acc + (n % 10)); //  tail recursive
}

public static void main(String[] args) {
    int num = 123;
    System.out.println(sumOfDigitsTail(num, 0)); // Start with acc = 0
  }
}
