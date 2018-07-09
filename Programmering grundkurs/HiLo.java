import java.util.Scanner; 

public class HiLo { 
    public static int counter; 

    public static void main(String[] args) { 

        Scanner s = new Scanner(System.in); 

        int choice[] = { 10, 100, 1000 }; 
        counter = 1; 

        System.out.println("Välkommen till HiLo!"); 
        System.out.println("Välj svårighetsgrad!"); 
        System.out.println("1. Lätt (1-10)"); 
        System.out.println("2. Mellan (1-100)"); 
        System.out.println("3. Svår (1-1000)"); 

        int player = s.nextInt(); 

        if (player == 1) { 
            playGame(choice[0]); 
        } else if (player == 2) { 
            playGame(choice[1]); 
        } else if (player == 3) { 
            playGame(choice[2]); 
        } 
    } 

    
    static int playGame(int maxNumber) {  
        Scanner s = new Scanner(System.in);  

        int answer = (int) (Math.random() * maxNumber) + 1;  

        System.out.println("Gissa på ett tal mellan 1 - " + maxNumber);  
        int guess = -1; 

        while (guess != answer) {  
            guess = s.nextInt();  
            giveResponse(guess, answer);  
            counter++;  
        }  
        return guess;  
  

    } 

    static void giveResponse(int guess, int answer) { 

        if (guess < answer) { 
            System.out.println("Gissningen är för låg!"); 
        } else if (guess > answer) { 
            System.out.println("Gissningen är för hög!"); 
        } else if (guess == answer) { 
            System.out.println("Helt rätt!"); 
            System.out.println("Du lyckades på " + counter + " försök!."); 
        } 
    } 
}  