import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){

/*        Scanner scanner = new Scanner(System.in);

        String name = "";
        String response = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        while(!response.equals("Q")){
            System.out.println("You are playing a game.");
            System.out.print("Press Q to quit! ");
            response = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        scanner.close();
*/
 /*       Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("Your age can't be Negative");
            System.out.println("Enter Your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " Years old");

        scanner.close(); */


        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(number < 1 || number > 10){
            System.out.println("Enter the number Between 1-\10: ");
            number = scanner.nextInt();
        }

        System.out.println("You picked " + number);

        scanner.close();

    }
}
