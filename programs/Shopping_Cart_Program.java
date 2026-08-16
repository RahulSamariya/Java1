package programs;

import java.util.Scanner;

public class Shopping_Cart_Program {

    public  static void main(String[] args){

        // Shopping Cart Program

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity;
        char currency = '$';
        Double total;

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the Price for each: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?  ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
