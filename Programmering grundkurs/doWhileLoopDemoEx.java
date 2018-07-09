import java.util.Scanner;
   
public class doWhileLoopDemoEx{
   public static void main(String[] args){
      int code = 1234;
      Scanner sc = new Scanner (System.in);
      int guess = 1234;
      do{
         System.out.println("Skriv in koden:");
         guess = sc.nextInt();
      }while(guess != code);
      System.out.println("Du klarde det!");
   }
}