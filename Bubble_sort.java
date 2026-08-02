public class Bubble_sort {
    public static void main(String[] args){

         int[] num = {3, 2, 8, 4, 6, 1, 5};

         for(int i = 0; i < num.length - 1; i++){

             for(int j = 0; j < num.length - 1 - i; j++){

                 if(num[j] < num[j+1]){
                     int temp = num[j];
                     num[j] = num[j+1];
                     num[j+1] = temp;
                 }

             }
         }

         for(int number : num){
             System.out.print(number + " ");
         }

    }
}
