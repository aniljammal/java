import java.util.Scanner;

public class PrimeNumbersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.hasNextInt() ? scanner.nextInt() : -1;

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int nthPrime = findNthPrime(N), count = 0, num = nthPrime + 1;
        System.out.println(N + "th Prime number is " + nthPrime);
        System.out.print(N + " prime numbers after " + nthPrime + " are: ");
        
        while (count < N) {
            if (isPrime(num)) {
                System.out.print(num + (++count < N ? ", " : "\n"));
            }
            num++;
        }
    }

    public static int findNthPrime(int n) {
        int count = 0, num = 2;
        while (true) if (isPrime(num++)) if (++count == n) return num - 1;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) if (num % i == 0 || num % (i + 2) == 0) return false;
        return true;
    }
}
