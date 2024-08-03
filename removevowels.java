import java.util.Scanner;
class removevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String res=str.replaceAll("[AEIOUaeiou]"," ");
        System.out.println("The string replacing vowels with spaces : "+res);
            }
}
