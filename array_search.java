import  java.util.Scanner;

public class array_search {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    int[] numbers = {1, 9, 2, 8, 3, 4, 5, 0};
    String[] fruits = {"apple", "pineapple",  "orange", "banana"};
    boolean isFound = false;

    System.out.print("Enter the fruit: ");
    String target = scanner.nextLine();

    for(int i = 0; i < fruits.length; i++){
        if(fruits[i].equals(target)){
            System.out.println("Elements found at index: " + i);
            isFound = true;
            break;
        }
    }

    if(!isFound){
        System.out.println("Element is not Found in the Array.");
    }

    }
}
