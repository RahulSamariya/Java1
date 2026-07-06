import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {


        // Calculate area og the rectangel and square

        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        perimeter = 2 * (width) + 2 * (height);

        System.out.println("area of rectangle is: " + area + " cm²");
        System.out.println("perimeter of the rectangle is " + perimeter);

        scanner.close();

    }
}
