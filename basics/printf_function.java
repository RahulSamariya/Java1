package basics;

public class printf_function {
    public static  void main(String[] args){

      // printf() = is a method used to format output

      // %[flags][width][.precision][specifier-character]

     /*
      String name = "Spongebob";
      char firstLetter = 'S';
      int age = 30;
      double height = 60.5;
      boolean isEmployed = true;

      System.out.printf("Hello %s\n", name);
      System.out.printf("Your name Start with letter %c\n", firstLetter);
      System.out.printf("You are %d years old\n", age);
      System.out.printf("You are %f inches tall\n", height);
      System.out.printf("Employed: %b\n", isEmployed);

      */


    // [flags] "%.numberf"
    // + = output a plus;
    // , = grouping separator
    // ( = negative numbers are enclosed in ()
    // space = display a minus if negative, space if positive

      double price1 =  9.99;
      double price2 = 10.10;
      double price3 = -54.01;

      System.out.printf("%.4f\n", price1);
      System.out.printf("%.4f\n", price2);
      System.out.printf("%.4f\n", price3);

      int id1 = 1;
      int id2 = 12;
      int id3 = 123;
      int id4 = 1234;

      System.out.printf("%04d\n", id1);
      System.out.printf("%4d\n", id2);
      System.out.printf("%-4d\n", id3);
      System.out.printf("%04d\n", id4);

    }
}
