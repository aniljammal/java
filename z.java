import java.util.Scanner;
class dectobinoct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int dec= scanner.nextInt();

        String bin;
        bin= Integer.toBinaryString(dec);
        String oct;
        oct = Integer.toOctalString(dec);

        System.out.println("Binary equivalent: "+bin);
        System.out.println("Octal equivalent: "+oct);
}
}