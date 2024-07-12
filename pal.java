import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Case = 1 for String, Case = 2 for Number");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        if (choice == 1) {
            System.out.println("Enter the string: ");
            String str = scanner.nextLine();
            System.out.println(isPalindrome(str) ? "Palindrome" : "Not a palindrome");
        } else if (choice == 2) {
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            System.out.println(isPalindrome(String.valueOf(num)) ? "Palindrome" : "Not a palindrome");
        }
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
