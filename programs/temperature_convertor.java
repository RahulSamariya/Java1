package programs;

import java.util.Scanner;

public class temperature_convertor {
    public temperature_convertor() {
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextInt();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.println(newTemp + unit );

        scanner.close();

    }
}
