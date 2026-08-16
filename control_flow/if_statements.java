package control_flow;

import java.util.Scanner;

public class if_statements {
    public static void main(String[] args){

        // if statement = perform a block of code if this condition is true


        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isstudent;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Are you a Student (true/false): ");
        isstudent = scanner.nextBoolean();

        // Group 1
        if(name.isEmpty()){
            System.out.println("You didn't Enter your name: ");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        // Group 2

        if(age >= 18 ){
            System.out.println("You are an adult");
        }
        else if(age >= 65){
            System.out.println("You are Senior!");
        }
        else if(age < 0){
            System.out.println("You are not born yet!");
        }
        else if(age == 0){
            System.out.println("You are a Baby!");
        }
        else{
            System.out.println("You are a Child!");
        }


        // Group 3

        if (isstudent){
            System.out.println("U are a Student!");
        }
        else{
            System.out.println("You are not a Student!");
        }

        scanner.close();

    }
}
