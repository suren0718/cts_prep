import java.util.Scanner;

public class cts3 {
  public static void main(String args[]){
    Scanner vinayak = new Scanner(System.in);
    int n = vinayak.nextInt();

    int[] arr = new int[n];
    int[] reversed = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = vinayak.nextInt();
    }
    int j=0;
    for(int i=arr.length-1; i>=0; i--){
      //System.out.print(arr[i] + " ");
      reversed[j] = arr[i];
      j++;

    }

    for(int i=0; i<reversed.length; i++){
      System.out.print(reversed[i] + " ");
    }


  }
  
}
