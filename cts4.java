import java.util.Scanner;
import java.util.ArrayList;

public class cts4{

  static ArrayList<Integer> oddarr(int[] arr){
    ArrayList<Integer> oddlist = new ArrayList<>();

    for(int i=0; i< arr.length; i++){
      if(arr[i] %2 != 0){
        oddlist.add(arr[i]);
      }

    }
    return oddlist;
  }

    public static void main(String args[]){
      Scanner suren = new Scanner(System.in);
      int[] arr= new int[5];
      for(int i=0; i<5; i++){
        arr[i]=suren.nextInt();

      }

      //oddarr(arr);
      System.out.println(oddarr(arr));

    }
  }
