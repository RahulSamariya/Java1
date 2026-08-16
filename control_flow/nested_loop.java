package control_flow;

import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args){

        // Nested loops = A loop inside another loop
        //                Usually used in the matrices and DSA

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of Rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of Columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the # symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
