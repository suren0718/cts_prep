import java.util.Scanner;

public class cts2 {
  public static void main(String args[]){
    Scanner palindrome = new Scanner(System.in);
    String pal = palindrome.nextLine();

    String rev=""
  ;
  for(int i = pal.length()-1; i>=0; i--){
    rev = rev+ pal.charAt(i);
  }

  if(pal.equals(rev)){
    System.out.println("The given string is a palindrome");
  }
  else{
    System.out.println("The given string is not a palindrome");
  }
  
}
}
