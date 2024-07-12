import java.util.Scanner;

 class DaysConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();
        
        int years = totalDays / 365;
        int weeks = (totalDays % 365) / 7;
        int days = totalDays % 365 % 7;

        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + days);
    }
}
