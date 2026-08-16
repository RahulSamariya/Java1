package methods;

public class Methods {
    public static void main() {

        // method = a block of resusable code that is executed when called()

        int age = 19;
        System.out.println(ageCheck(age));
        System.out.println(sqaure(3));
        if (age >= 18) {
            System.out.println("You may be sign Up!");
        } else {
            System.out.println("You must be 18+ to sign up!");
        }

    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");

    }
    static double sqaure(double number) {
        return number * number;
    }
    static double cube(double number) {
        return number * number * number;
    }
    static String getFullName(String first, String last) {
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}