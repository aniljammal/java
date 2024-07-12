import java.util.Scanner;
class Arrea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l,b,bs,he,rad,pi=3.14,circ,rect,tri,vol;
        System.out.print("Enter l,b,base, height and radius: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
        bs = sc.nextDouble();
        he = sc.nextDouble();
        rad = sc.nextDouble();
        circ=pi*rad*rad;
        rect=l*b;
        tri=0.5*bs*he;
        vol=(4/3)*pi*rad*rad*rad;
        System.out.println("Area of circle " + circ);
        System.out.println("Area of Triangle " + tri);
        System.out.println("Area of Rectangle " + rect);
        System.out.println("volume of sphere " + vol);
    }
}