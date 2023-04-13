import java.util.Scanner;
import java.math.MathContext;

public class Exercise2 {
    //      Write a program that gets the user the radius
    //      and print the area and perimeter of a circle
//    Circle:      PI*R*R       2 * PI * R

    public static void main(String[] args) {
//        create a scanner object
        Scanner scanner = new Scanner(System.in);

//read user input
        System.out.println("Enter the radius: ");
        int radius = scanner.nextInt();


        float area = (float)(Math.PI * radius * radius);
        float perimeter = (float)(2 * Math.PI * radius);
        System.out.println("Area of circle is " + area);
        System.out.println("Perimeter of circle is " + perimeter);



    }
}