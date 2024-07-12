import java.util.Scanner;

 class UsersCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Users: ");
        int totalUsers = sc.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = sc.nextInt();

        int nonTeachingStaffUsers = staffUsers / 3;
        int studentUsers = totalUsers - (staffUsers + nonTeachingStaffUsers);

        System.out.println("Student Users: " + studentUsers);
    }
}
