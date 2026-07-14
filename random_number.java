import java.util.Random;
import java.util.Scanner;

public class random_number {
    public static void main (String[] arg){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 6);
        number2 = random.nextInt(1, 6);
        number3 = random.nextInt(1, 6);

        System.out.println(number3);
        System.out.println(number2);
        System.out.println(number1);

    }
}
