package control_flow;

import java.util.Scanner;

public class For_Loops {
    public static void main(String[] args) throws InterruptedException {

     // for loops executes the codes certain amount of times

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to repeat the loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i <= max ; i++ ){
            System.out.println(i);
        }

        System.out.print("Enter how many seconds are remaining fopr the countdown: ");
        int start = scanner.nextInt();

        for(int i = start ; i > 0 ; i-- ){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.print("Happy New Year!");

        scanner.close();

    }
}
