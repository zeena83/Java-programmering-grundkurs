import java.util.Scanner;

public class switchDemo {
   public static void main(String[] args){
   
     
      int number = 2;
      switch(number){
         case 1:
            System.out.println("Du valde nummer 1");
            break;
         case 2:
            System.out.println("Du valde nummer 2");
            break;
         case 3:
            System.out.println("Du valde nummer 3");
            break;
         case 4:
            System.out.println("Du valde nummer 4");
            break; 
          default:
            System.out.println("Ditt val passade inte in!"); 
            break;       
      }
   }
}
