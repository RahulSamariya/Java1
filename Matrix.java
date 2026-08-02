public class Matrix {
     public static void main(String[] args){

     /*  A 2D array is an array of arrays.
         Use two indexes:
         matrix[row][column]
         Use nested loops to access every element.
                 matrix.length → number of rows.
                 matrix[row].length → number of columns in that row. */

         int[][] Matrix1= new int[3][3];
         int[][] matrix = {

                 {0, 0, 0,},
                 {0, 0, 0,},
                 {0, 0, 0,},
         };
         int num = 0;

         for (int i = 0; i < matrix.length; i++){

             for (int j = 0; j < matrix[i].length; j++){
                 num += 2;
                 matrix[i][j] = num;
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
         }


     }
}
