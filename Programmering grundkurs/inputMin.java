import java.util.Scanner;

public class inputMin{
   public static void main(String[] aregs){
   Scanner sc = new Scanner(System.in);
   int term1, term2 , sum;
   System.out.println("Skulle du vilja vara så vänlig och skriva in två tal?");
   term1 = sc.nextInt();
   term2 = sc.nextInt();
   sum = term1 + term2;
   System.out.println("Summan av dom två talen är:");
   System.out.println(sum);
   }
}
