import java.util.Scanner;

class Scanner_example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter your Favorite colour: ");
        String color = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student: " + isStudent );


        if(isStudent){
            System.out.println("You are not enrolled as a student");
        }
        else{
            System.out.println("you are NOT enrolled");
        }

        // Common issuse when accepting the integer and then accepting the string

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter your favourite color: ");
        String color1 = scanner.nextLine();

        System.out.print("you are " + age + " years old");
        System.out.println("you like the color " + color1);


        scanner.close();
    }

}
