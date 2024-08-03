import java.util.Scanner;
 class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int primeCount = 0, compositeCount = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 2) {
                if (number == 1) compositeCount++;
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }
        System.out.println("Prime number: " + primeCount);
        System.out.println("Composite number: " + compositeCount);
    }
}
