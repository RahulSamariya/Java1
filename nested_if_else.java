import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args){

        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are u student? (true/false):  ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are u Senior? (true/false):  ");
        isSenior = scanner.nextBoolean();

        System.out.println("\n");

        if(isStudent)
        {
            if (isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a Student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else
        {
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.printf("The price of the ticket is: $%.2f", price );

        scanner.close();

    }
}
