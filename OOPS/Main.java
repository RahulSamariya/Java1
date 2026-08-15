package OOPS;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

     Student student = new Student("Spongebob", 15, 5.5);
     Student student1 = new Student("Spiderman");

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        student.study();

        System.out.println(student1.name);
        student.study();

    }
}