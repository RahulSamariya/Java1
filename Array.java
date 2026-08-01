import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        String[] fruits = { "apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        // int numOFFruits = fruits.length;
        java.util.Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

      //  for(int i = 0; i < fruits.length; i++){
      //      System.out.println(fruits[i]);}

        for(String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
