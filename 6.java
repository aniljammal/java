import java.util.Scanner;
 class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);
        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();
        double bonus = calculateBonus(salary, grade);
        double totalSalary = salary + bonus;
        System.out.printf("Salary = %.2f\n", salary);
        System.out.printf("Bonus = %.2f\n", bonus);
        System.out.printf("Total to be paid = %.2f\n", totalSalary);
        scanner.close();
    }
    public static double calculateBonus(double salary, char grade) {
        double bonusPercentage = (grade == 'A' || grade == 'a') ? 0.05 : (grade == 'B' || grade == 'b') ? 0.10 : 0;
        double bonus = salary * bonusPercentage;
        if (salary < 10000) {
            bonus += salary * 0.02;
        }
        return bonus;
    }
}
