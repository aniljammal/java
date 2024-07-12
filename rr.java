import java.util.Scanner;
class nperf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 0;
        int num = 1;
        while (count < n) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
                count++;
            }
            num++;
}
}
}