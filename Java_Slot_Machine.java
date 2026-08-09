import java.util.Random;
import java.util.Scanner;

public class Java_Slot_Machine {
    public static void main(String[] args){

        //  JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int bet;
        int payout;
        String[] row;

        System.out.println("************************");
        System.out.println("Welcome to Slot Machine");
        System.out.println("Symbols: 🍕 🍔 🍟 🌭 🍿 ");
        System.out.println("************************");

        while(balance > 0){
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if (bet <= 0){
                System.out.println("Bet must be Greater than 0");
            }
            else
            {
                balance -= bet;
                System.out.println("$" + balance);
            }

            System.out.println("Spinning...");
            spinrow();
        }
        // GET PAYMENT
        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE

        scanner.close();
    }
    static String[] spinrow(){

        String[] symbols = {"🍕" , "🍔", "🍟",  "🌭", "🍿"};
        String[] row = new String[3];
        Random random = new Random();


        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        };

        
        return row;

    }
}
