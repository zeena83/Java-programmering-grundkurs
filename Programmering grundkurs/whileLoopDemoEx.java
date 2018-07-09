import java.util.Scanner;

public class whileLoopDemoEx{
   public static void main(String[] args){
      int code = 1234;
      Scanner sc = new Scanner (System.in);
      int guess = 0;
      while(guess != code ){
         System.out.println("Skriv in koden!");
         guess = sc.nextInt();
      }
      System.out.println("Du klarde det!");
   }
}