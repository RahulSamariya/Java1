import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double num1;
    double num2;
    char Operator;
    double result = 0;
    boolean validOperator = true;

        System.out.print("Enter the first num1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the Operator (+, -, *. /, ^): ");
        Operator = scanner.next().charAt(0);

        System.out.print("Enter the second num2: ");
        num2 = scanner.nextDouble();

        switch(Operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            case '/' -> {
                if(num2 == 0){
                    System.out.println("number cannot be divided by the 0");
                    validOperator = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            default ->  {
                System.out.println("Error: Invalid operator entered.");
                validOperator = false;
            }
            }

            if(validOperator){
                System.out.println(result);
        }
    }
}
