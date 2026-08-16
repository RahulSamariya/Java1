package methods;

public class Overloaded_method {
    public static void main(String[] args) {

        // Overloaded methods = methods that share the same name;
        //                      But different parameters
        //                      Signature = name + parameter

        System.out.println(((add(1,2,3))));

    }

    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static String bakePizza(String bread){
        return bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " Pizza";
    }
}
