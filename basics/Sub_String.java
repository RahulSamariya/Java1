package basics;

import java.util.Scanner;

public class Sub_String {
    public static  void main(String[] args){

        // .substring() = A methods used to extract a portion of a string
        // .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email:  ");
        email = scanner.nextLine();

        username = email.substring(0 ,email.indexOf("@"));
        domain = email.substring(email.indexOf("@"));

        if(email.contains("@")){
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Email must contains @");
        }



    }
}
