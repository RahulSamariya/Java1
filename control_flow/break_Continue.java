package control_flow;

import java.util.Scanner;

public class break_Continue {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();

        for(int i=0; i<max; i++){

            if(i%2==0){
                continue;
            }
            else if(i%max==10){
                break;
            }

            System.out.println(i);
        }
    }
}
