import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[] factors = new int[n]; 
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[count] = i;
                count++;
            }
        }

        System.out.println("The number of factors of the number " + n + " is: " + count);

        System.out.print("Enter the n value: ");
        int num = sc.nextInt();

        if (num > 0 && num <= count) {
            System.out.println("The " + num + "th factor of " + n + " is: " + factors[num - 1]);
        } else {
            System.out.println("Invalid input: n value must be between 1 and " + count);
        }
    }
}
