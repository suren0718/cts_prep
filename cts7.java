import java.util.Scanner;

public class ct7 {

    static int fibonacci(int n){
      if(n>1){
        return fibonacci(n-1) + fibonacci(n-2);
      }
      else if(n==1){
        return 1;
      }
      else{
        return 0;
      }
    }

      public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms:");
        for(int i=0; i<n; i++){
          System.out.print(fibonacci(i) + " ");
        }

      


      }
    }
  
  

