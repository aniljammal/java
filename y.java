import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
class kth{
  public static void main(String[] args){
    int k,n,min,max;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    n=sc.nextInt();
    Integer[] ar = new Integer[n];
    System.out.print("Enter the elements of the array : ");
    for(int i=0;i<n;i++){
     ar[i]=sc.nextInt();
    }
    System.out.print("Enter the k value : ");
    k=sc.nextInt();
    if(k<0||k>n){
    System.out.print("Invalid input of k value!!");
    }else{
      Arrays.sort(ar);
      min=ar[k-1];
      Arrays.sort(ar,Collections.reverseOrder());
      max=ar[k-1];
    System.out.print("\n"+k+"st/nd/rd/th maximum value in the array : "+max);
    System.out.print("\n"+k+"st/nd/rd/th minimum value in the array : "+min);
}
}
}
