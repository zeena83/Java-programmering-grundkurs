import java.util.Scanner;

public class �vning1L�sning{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Vilken m�nad? (sm� bokst�ver)");
      String month = sc.nextLine();
      
      if(month.equals("januari")){
         System.out.println("31 dagar");
      }
      else if(month.equals("februari")){
         System.out.println("Skot�r? ja/nej");
         String leapYear = sc.nextLine();
         if(leapYear.equals("ja")){
            System.out.println("29 dagar");
         }
         else if(leapYear.equals("nej")){
            System.out.println("28 dagar");
         }
      }
      else if(month.equals("mars")){
         System.out.println("31 dagar");
      }
   }
}