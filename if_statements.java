import java.util.Scanner;

public class if_statements {
    public static void main(String[] args){

        // if statement = perform a block of code if this condition is true

        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        scanner.close();

        if(age >= 18 ){
            System.out.println("You are an adult");
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

    }
}
