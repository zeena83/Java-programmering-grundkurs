import java.util.Scanner;

public class arrayDel2{
   public static void main(String[] args){ 
      
     // int arrayLength = 7;
     // int[] number = new int[arrayLength];
      
     // int index = 2;
     // number[index] = 56;
      
     // System.out.println(number.length);
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Hur många hundar har du?");
     
     int numberOfDogs = sc.nextInt();
     sc.nextLine();
     
     String[] dags = new String[numberOfDogs];
     
     System.out.println("Vad heter dina "+numberOfDogs+" hundar");
     
    // dags[0] = "Elona";
    // dags[1] = "Enanna";
    //dags[2] = "Sara";
    // dags[3] = "Maryia";
    // dags[4] = "Samantha";
     for(int i = 0; i< dags.length; i = i +1){
         dags[i] = sc.nextLine();
      
     }
     
     System.out.println("Dina hundar heter:");
     
     for(int i = 0; i < dags.length; i = i + 1){
     
      System.out.println(dags[i]);
     }
   }
}