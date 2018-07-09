import java.util.Scanner;

public class If{
   public static void main(String[] args){
      System.out.println("How old are you?");
      Scanner sc = new Scanner (System.in);
      int age = sc.nextInt();
      if(age == 150){
         System.out.println("You'r a turtle!");
         System.out.println("I'm impressed!");
      }else if (age == 25){
       System.out.println("If you'r a human you are full grow!");
      }else if (age == 0){
       System.out.println("You are new born!");
      }else{
       System.out.println("You are not 150, 25 or 0 years old!");
      }
   }
}