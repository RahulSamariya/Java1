package OOPS;

public class Car {

    String make = " Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 50046.34;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("you Start the Engine");
    }
    void stop(){
        isRunning = true;
        System.out.println("You Stop the Engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You Brake the " + model);
    }

}