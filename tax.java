import java.util.Scanner;
 class t {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();
        double ta = Math.max(0, income - 250000);
        double tax = c(ta);
        System.out.println("Taxable Income: " + ta);
        System.out.println("Tax = " + tax);
    }
    public static double c(double ta) {
        if (ta <= 0) return 0;
        else if (ta <= 250000) return 0.1 * ta;
        else if (ta <= 750000) return 25000 + 0.2 * (ta - 250000);
        else return 125000 + 0.3 * (ta - 750000);
    }
}
