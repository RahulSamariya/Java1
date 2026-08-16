package OOPS;

public class Car_Array_of_Objects {

    String model;
    String color;

    Car_Array_of_Objects(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }

}
