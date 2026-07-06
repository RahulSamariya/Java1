public class main {

    public static void main(String[] args){

/*        System.out.println("I like Maggi!\n");
       System.out.println("its tasty");
        System.out.println();  */

        int age = 18;
        int year = 2026;
      //  int quantity = 2;

        double price = 19999.99;
        double spi = 9.00;
    //    double temp = 27.83;

        char grade = 'A';
        char symbol = '=';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
     //   boolean shouldBuy = true;

        String name = "Bro Code";
        String name2 = "Hello";
        String food = "Maggi";
        String email = "fake123@gmail.com";
        String colour = "red";
        String car = "Lamborghini";


        System.out.println("hello " + name);
        System.out.println("you are " + age + " years old");
        System.out.println("Your gpa is " + spi);
        System.out.println("your average letter grade is " + grade);
        System.out.println("Your Favourite food is " + food);
        System.out.println("Your choice is a " + colour + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);


        if (forSale) {
            System.out.println("The " + car + "  for sale");
        } else {
            System.out.println("There is a " + car + " not for sale");
        }

    }
}
