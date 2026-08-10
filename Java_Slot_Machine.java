import java.util.Random;
import java.util.Scanner;

public class Java_Slot_Machine {

    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("************************");
        System.out.println("Welcome to Slot Machine");
        System.out.println("Symbols: 🍕 🍔 🍟 🌭 🍿");
        System.out.println("************************");

        while (balance > 0) {

            System.out.println("\nCurrent balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }

            if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            }

            balance -= bet;
            System.out.println("\nSpinning...");
            row = spinrow();
            printRow(row);
            payout = getpaymentout(row, bet);

            // Give winnings
            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry! You lost this round.");
            }

            // Check balance
            if (balance <= 0) {
                System.out.println("\nYou ran out of money!");
                break;
            }

            // Play again
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = scanner.next().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("\n************************");
        System.out.println("Thanks for playing!");
        System.out.println("Final balance: $" + balance);
        System.out.println("************************");

        scanner.close();
    }


    static String[] spinrow() {

        String[] symbols = {"🍕", "🍔", "🍟", "🌭", "🍿"};

        String[] row = new String[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row) {

        System.out.println("*****************");
        System.out.println("   " + String.join(" | ", row));
        System.out.println("*****************");
    }
    static int getpaymentout(String[] row, int bet) {


        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍕" -> bet * 3;
                case "🍔" -> bet * 4;
                case "🍟" -> bet * 5;
                case "🌭" -> bet * 10;
                case "🍿" -> bet * 20;
                default -> 0;
            };
        }

        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍕" -> bet * 2;
                case "🍔" -> bet * 3;
                case "🍟" -> bet * 4;
                case "🌭" -> bet * 5;
                case "🍿" -> bet * 10;
                default -> 0;
            };
        }

        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍕" -> bet * 2;
                case "🍔" -> bet * 3;
                case "🍟" -> bet * 4;
                case "🌭" -> bet * 5;
                case "🍿" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}

