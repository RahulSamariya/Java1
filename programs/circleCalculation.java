package programs;

import java.util.Scanner;

public class circleCalculation {

    public static void main(String[] args){

        // Area = pi * r²
        // Circumference = pi * r * 2
        // Volume = (4/3) * pi * r³

        double r;
        double area;
        double volume;
        double circumference;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the Circle: ");
        r = scanner.nextDouble();

        circumference = Math.PI * 2 * r;
        area = Math.PI * Math.pow(r , 2);
        volume = Math.PI * Math.pow(r, 3) * 4/3;



    }

}
