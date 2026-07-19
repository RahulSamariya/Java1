import java.util.Scanner;

public class math_fuc {
    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 10);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(5.225);
        result = Math.ceil(3.14);
        result = Math.floor(3.56);
        result = Math.max(10, 20);

        // HYPOTENUSE c = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of side A: ");
        b = scanner.nextDouble();

        System.out.println(result);
    }
}


