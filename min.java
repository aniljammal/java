import java.util.Arrays;
public class MthMaxNthMin {
    public static void main(String[] args) {
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int M = 1; // Change as required
        int N = 3; // Change as required
        Arrays.sort(array);
        int mthMax = array[array.length - M];
        int nthMin = array[N - 1];
        System.out.println(M + "th Maximum Number = " + mthMax);
        System.out.println(N + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + (mthMax + nthMin));
        System.out.println("Difference = " + (mthMax - nthMin));
    }
}
