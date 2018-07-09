import java.util.Scanner;

public class Synlighet{
   public static void main(String[] args){
     int a = 5;
     int b = 7;
     a = a + b;
     
     if (a > b){
      int c = 10;
      a = a + c;
      if(true){
         int d = 20;
         a = b + c +  d;
      }
     }
     System.out.println(a);
   }
}