import java.util.Scanner;
//Q: Write a program to make such a pattern like a pyramid
// with a number which will repeat the number in the same row.
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of rows they want in the pyramid
        System.out.print("Enter the number of rows in the pyramid: ");
        int numRows = input.nextInt();

        // Calculate the total number of characters in each row (including spaces)
        int rowLength = (numRows * 2) - 1;

        // Loop through each row of the pyramid
        for (int i = 1; i <= numRows; i++) {

            // Calculate the number of digits that will be in this row
            int numDigits = (i * 2) - 1;

            // Calculate the number of spaces that will be needed to center the digits in the row
            int numSpaces = (rowLength - numDigits) / 2;

            // Loop through each space in the row and print a space character
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }

            // Loop through each digit in the row and print the current row number
            for (int j = 1; j <= numDigits; j++) {
                System.out.print(i + " ");
            }

            // Print a newline character to move to the next row
            System.out.println();
        }
    }
}