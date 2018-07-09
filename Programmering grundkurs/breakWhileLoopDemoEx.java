import java.util.Scanner;
   
public class breakWhileLoopDemoEx{
   public static void main(String[] args){
   
      int code = 1234;
      
      Scanner sc = new Scanner (System.in);
      
      int guess = 1234;
      
            while(true){
            
               System.out.println("Vad är koden?");
               
               guess = sc.nextInt();
               
               if(guess == code){
               
                  break;
               }
            }
   }
}