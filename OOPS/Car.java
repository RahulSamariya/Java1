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

    /*
     Student student = new Student("Spongebob", 15, 5.5);
     Student student1 = new Student("Spiderman");



        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        student.study();

        System.out.println(student1.name);
        student.study(); */

}