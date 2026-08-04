import java.util.Scanner;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{

            System.out.println("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice!");
                continue;
            }

            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer Choice is: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a Tie!");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You Win!");
            }
            else{
                System.out.println("You Lose!");
            }

            System.out.println("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for Playing Game!");

        scanner.close();

    }
}
