import java.util.Scanner;

public class swtich_case {
        public static  void main(String[] args) {

            // Enhanced switch = A replacement to many else of statements

            Scanner scanner = new  Scanner(System.in);

            System.out.print("Enter the day of the Week: ");
            String day = scanner.nextLine();

            switch (day) {
                case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
                        System.out.println("It is a weekday");
                case "Sunday","Saturday" ->
                        System.out.println("It is a weekend");
                default ->
                        System.out.println(day + " is not a day");
                }

        }
}
