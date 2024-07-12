import java.util.Scanner;
class stop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pos = 0;
        int pCount = 0;
        int neg = 0;
        int nCount = 0;

        System.out.println("Enter numbers (enter -1 to stop):");

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            if (num > 0) {
                pos += num;
                pCount++;
            } else if (num < 0) {
                neg += num;
                nCount++;
            }
        }

        if (pCount > 0) {
            double avPos = (double) pos / pCount;
            System.out.println("Average of positive numbers: " + avPos);
        } else {
            System.out.println("No positive numbers entered.");
        }

        if (nCount > 0) {
            double avNeg = (double) neg / nCount;
            System.out.println("Average of negative numbers: " + avNeg);
        } else {
            System.out.println("No negative numbers entered.");
}

}
}
