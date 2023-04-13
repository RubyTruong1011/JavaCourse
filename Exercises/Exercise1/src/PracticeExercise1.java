import  java.util.Scanner;
//import the Scanner class

//Write a program that gets from the user 2 numbers
//and displays their division and remainder

public class PracticeExercise1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);    // Create a Scanner object
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int number1 = scanner1.nextInt();   // Read user input
        int number2 = scanner2.nextInt();
        System.out.println("Two numbers are " + number1 + " and " + number2);

        float division = (float) number1 / number2;
        float remainder = number1 % number2;
        System.out.println("Their division is " + division);
        System.out.println("Their remainder is " + remainder);

    }
    }



