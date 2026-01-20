import java.util.Scanner;

public class cts8 {
  public static void main(String args[]){

    int count=0;
    Scanner sc= new Scanner(System.in);

    int n = sc.nextInt();
    int high = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i] =sc.nextInt();
    }

    for(int j=0; j<n;j++){
      if(arr[j]>high){
        count++;
      }
    }

    System.out.print(count);
    

  }
  
}
