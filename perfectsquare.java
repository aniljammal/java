import java.util.Scanner;
import java.util.ArrayList;

 class PerfectSquares {
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < 10) {
                result.add(i);
            }
        }
        
        System.out.println(result);
    }
}
