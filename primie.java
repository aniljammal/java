public class PrimeCompositeCounter {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] result = countPrimesAndComposites(array);
        System.out.println("Prime count: " + result[0]);
        System.out.println("Composite count: " + result[1]);
    }
    public static int[] countPrimesAndComposites(int[] arr) {
        int primeCount = 0;
        int compositeCount = 0;

        for (int num : arr) {
            if (num > 1) { 
                if (isPrime(num)) {
                    primeCount++;
                } else {
                    compositeCount++;
                }
            }
        }
        return new int[]{primeCount, compositeCount};
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
