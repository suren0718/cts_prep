import java.util.Scanner;

public class cts5 {

  static String rev(String s){
    
    String result="";
    for(int i=s.length()-1; i>=0; i--){
      result += s.charAt(i);
    }
  
  return result;
  }

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    String s = Integer.toString(n);

    System.out.print(rev(s));
  }

}
