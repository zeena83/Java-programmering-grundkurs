import java.util.Scanner;
   
public class switchLoopDemoEx{
   public static void main(String[] args){
   
      System.out.println("Skriv in ett nummer f�r att f� reda p�namnet p� dagen:");
      
      Scanner sc = new Scanner(System.in);
      
      int number = sc.nextInt();
      
      switch(number){
         case 1:
            System.out.println("M�ndag");
            break;
         case 2:
             System.out.println("Tisdag");
            break;

         case 3:
             System.out.println("Onsdag");
            break;

         case 4:
             System.out.println("Torsdag");
            break;

         default:
             System.out.println("Ogiltigt nummer!");
            break;

         
      }
      
      
   }
         
}