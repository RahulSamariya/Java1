public class array_search {
    public static void main(String[] args){

    int[] numbers = {1, 9, 2, 8, 3, 4, 5, 0};
    int target = 6;
    boolean isFound = false;

    for(int i = 0; i < numbers.length; i++){
        if(target==numbers[i]){
            System.out.println("Elements found at index: " + i);
            isFound = true;
            break;
        }
    }


    }
}
