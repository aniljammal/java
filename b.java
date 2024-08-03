import java.util.Scanner;
class Chunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, pi = 3.14, area;
        System.out.print("Enter the radius:");
        a=sc.nextDouble();
        area = pi * a * a;
        System.out.println("Area of the circle: " + area);
    }
}