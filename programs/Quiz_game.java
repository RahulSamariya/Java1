package programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Quiz_game {
    public static void main(String[] args){

        String[] questions= {"What is the main function of the Router?",
                "Which part of the computer is considered as the Brain?",
                "What year is the Facebook Launched?",
                "Who is known as the Father of the computer?",
                "What is the first programing Language"};

        String[][] options = {{"1. Storing Files", "2. Encrypting the Data", "3. Directing the Internet Traffic", "4. Managing Password"},
                            {"1. CPU", "2. hard Drives", "3. RAM", "4. GPU"},
                            {"1. 2008", "2. 2002", "3. 2004", "4. 2006"},
                            {"1. Steve Jobs ", "2. Allen Tuning", "3. Bil Gates", "4. Chales babbage"},
                            {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answer = {3, 1, 1, 4, 3 };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("****************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your Guess: ");
            guess = scanner.nextInt();

            if(guess == answer[i]){
                System.out.println("**********");
                System.out.println(" CORRECT! ");
                System.out.println("**********");
                score++;
            }
            else{
                System.out.println("**********");
                System.out.println("Try Again!");
                System.out.println("**********");
            }
        }

        System.out.println("Your Final Score is " + score + " out of the " + questions.length);

        scanner.close();

    }
}
