import java.util.Scanner;

public class inputMin{
   public static void main(String[] aregs){
   Scanner sc = new Scanner(System.in);
   int term1, term2 , sum;
   System.out.println("Skulle du vilja vara s� v�nlig och skriva in tv� tal?");
   term1 = sc.nextInt();
   term2 = sc.nextInt();
   sum = term1 + term2;
   System.out.println("Summan av dom tv� talen �r:");
   System.out.println(sum);
   }
}
