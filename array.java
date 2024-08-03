import java.util.Scanner;
import java.util.Arrays;
public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter N for Nth largest number:");
        int N = scanner.nextInt();
        if (N > size || N <= 0) {
            System.out.println("Invalid N value.");
            return;
        }
        Arrays.sort(array);
        int nthLargest = array[size - N];
        System.out.println(N + "th Largest number: " + nthLargest);
    }
}
