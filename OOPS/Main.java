package OOPS;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

     Student student = new Student("Spongebob", 15, 5.5);
     Student student1 = new Student("Spiderman", 18, 9.69);

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

    }
}