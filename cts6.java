import java.util.Scanner;

public class cts6{
  public static void main(String args[]){
    Scanner raghulan = new Scanner(System.in);
    int n = raghulan.nextInt();
    for (int i=2; i<n; i++){
      if(n%i==0){
        System.out.println("Not a prime number");
        break;
      }
      else{
        System.out.println("Prime number");
        break;
      }
    }
  
  }
}
