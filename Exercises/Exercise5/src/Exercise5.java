import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
//Question: Write a program to reverse a string

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String to reverse: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.println("The Reversed String: ");

        for (int i = letters.length-1; i>=0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}