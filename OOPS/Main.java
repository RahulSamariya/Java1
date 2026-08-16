package OOPS;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Car_Array_of_Objects car1 = new Car_Array_of_Objects("Mustang", "Blue");
        Car_Array_of_Objects car2 = new Car_Array_of_Objects("Charger","Red");
        Car_Array_of_Objects car3 = new Car_Array_of_Objects("Corvette", "Yellow");

        Car_Array_of_Objects[] cars = {car1, car2, car3};

        for (Car_Array_of_Objects car : cars) {
            car.drive();
        }

    }
}