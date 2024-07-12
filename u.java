import java.util.Scanner;
 class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] deno = new int[4];
        int[] notes = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the " + (i + 1) + "st Denomination: ");
            deno[i] = sc.nextInt();
            System.out.print("Enter the " + (i + 1) + "st Denomination number of notes: ");
            notes[i] = sc.nextInt();
        }

        int totBal = 0;
        for (int i = 0; i < 4; i++) {
            totBal += deno[i] * notes[i];
        }
        System.out.println("Total Available Balance in ATM: " + totBal);
}
}
