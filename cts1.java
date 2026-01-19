import java.util.Scanner;
public class cts1 {
  public static void main(String args[]){
    Scanner suren = new Scanner(System.in);
    String str =suren.nextLine();
    String empty="";
    
    int[] arr = new int[3];

    for(int i=str.length()-1; i>=0; i--){
      //System.out.print(str.charAt(i));
      empty += str.charAt(i);
    }
    System.out.println(empty);

  }
  
}
