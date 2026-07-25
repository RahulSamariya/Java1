import java.util.Scanner;

public class logical_Operator {
    public static void main(String[] args){

        // && = AND
        // || = OR
        // ! = NOT

         double temp = 20;
         boolean isSunny = true;

         if(temp <= 30 && 0 >= temp && isSunny){
            System.out.println("The Weather is Good 😀");
            System.out.println("It is Sunny outside ");
         }
         else if(temp <= 30 && 0 >= temp && !isSunny){
             System.out.println("The Weather is Good 😀");
             System.out.println("It is Cloudy outside ");
         }
         else if(temp > 30 || 0 < temp){
             System.out.println("The Weather is Bad!");
         }

          Scanner scanner = new Scanner(System.in);

         String Username;

        System.out.println("Enter your new username: ");
        Username = scanner.nextLine();

        if(Username.length() < 4 || Username.length() > 12){
            System.out.println("Username must be between (4-12)");
        }
        else if(Username.contains(" ") || Username.contains("_")){
            System.out.println("Username Cannot contains spaces and UnderScores");
        }
        else{
            System.out.println("Welcome " + Username);
        }
    }
}