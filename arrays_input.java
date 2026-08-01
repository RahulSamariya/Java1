import java.util.Scanner;

public class arrays_input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.println("What # of the food u want? ");
        size = scanner.nextInt();
        System.out.println();

        foods = new String[size];

        for(int i = 0; i <= foods.length; i++){
            System.out.print("Enter the food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

    }
}
