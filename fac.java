import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int givenNumber = scanner.nextInt();
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        findFactors(givenNumber, N);
    }

    public static void findFactors(int number, int n) {
        if (number <= 0) {
            System.out.println("Factors are only defined for positive integers.");
            return;
        }
        int count = 0, nthFactor = -1;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (++count == n) nthFactor = i;
            }
        }
        System.out.println("Number of factors = " + count);
        System.out.println(n + "th factor " + (nthFactor != -1 ? ("= " + nthFactor) : "does not exist for " + number));
    }
}
