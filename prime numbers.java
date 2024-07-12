import java.util.Scanner;
import java.util.ArrayList;

 class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int nthPrime(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }
        return num - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        
        int nthPrime = nthPrime(n);
        System.out.println(n + "th Prime number is " + nthPrime);
        
        ArrayList<Integer> primesAfter = new ArrayList<>();
        int count = 0;
        int num = nthPrime + 1;
        while (count < n) {
            if (isPrime(num)) {
                primesAfter.add(num);
                count++;
            }
            num++;
        }
        System.out.println(n + " prime numbers after " + nthPrime + " are: " + primesAfter);
    }
}
