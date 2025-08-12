public class ContributionCounter {
    public static void countTo700(int start) {
        for (int i = start; i <= 707; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nYes! Contribution 700 reached. Welcome  Bhavneet ..");
    }

    public static void main(String[] args) {
        int currentContribution = 699;  // starting point
     countTo700(currentContribution);
    }
}
