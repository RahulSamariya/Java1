package basics;

public class String_method {
    public String_method() {
    }

    public static void main(String[] args){

     String name =  "Rahul Samariya";

//     int length = name.length();
//     char letter = name.charAt(2);
//     int Index = name.indexOf("a");
//     int lastIndex = name.lastIndexOf("r");
//
//    name = name.toUpperCase();
//
//     System.out.println(length);
//     System.out.println(letter);
//     System.out.println(Index);
//     System.out.println(lastIndex);

     /*   name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace('a', 'o');

        if(name.isEmpty()) {
            System.out.println("Your name is empty!");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Yours name contains Space");
        }
        else{
            System.out.println("Yours name doesn't contains Space");
        }

        */

        if(name.equals("password")){
            System.out.println("Yours name can't be the password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
