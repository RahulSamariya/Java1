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

    /*  Car_Array_of_Objects[] cars = {new Car_Array_of_Objects("Mustang", "Red"),
                                       new Car_Array_of_Objects("Convette", "Yellow"),
                                       new Car_Array_of_Objects("Charger", "Blue")};

        for(Car_Array_of_Objects car : cars){
            car.color = "Black";
        }

        for (Car_Array_of_Objects car : cars) {
            car.drive();
        } */


}
