import java.util.Random;
import java.util.Scanner;

public class number_Guessing_Game {
    public static void main(String[] args){

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min , max+1);

        System.out.println("Number Guessing Game!");
        System.out.printf("Guess a number between the %d-%d\n", min, max);

        do{
            System.out.println("Enter a Guess: ");
            guess =  scanner.nextInt();
            attempts ++;

            if(guess < randomNumber){
                System.out.println("Too Low! Try Again");
            }
            else if(guess > randomNumber){
                System.out.println("Too High! Try Again");
            }
            else{
                System.out.println("CCORRECT! The Number was " + randomNumber);
                System.out.println("# of Attempts");
            }

        }while(guess != randomNumber);

        scanner.close();
    }
}
