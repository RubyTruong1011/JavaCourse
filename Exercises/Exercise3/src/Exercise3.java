import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args)
//   Question: Write a program to convert a decimal number to binary number

/**To convert a decimal number to binary number, there are 5 steps:
 * 1. Divide the decimal number by 2
 * 2. Write down the quotient and the remainder
 * 3. If the quotient is not zero, divide it by 2 and repeat step 2
 * 4. Continue this process until the quotient is zero
 * 5. Write the remainders in reverse order
 */
    {
        int decimal, quotient;
        int[] binary = new int[100];
        int i = 1, j;

//        Create a Scanner Object to read input from the user
        Scanner input = new Scanner(System.in);

//        Prompt the user for a decimal number
        System.out.println("Enter a decimal number: ");
        decimal = input.nextInt();

        quotient = decimal;

//        Convert decimal to binary
        while (quotient != 0) {
            binary[i++] = quotient % 2;
            quotient = quotient / 2;
        }
//       => while loop works: the code snippet converts a decimal number to binary by repeatedly dividing by 2,
//        recording the remainders (which are either 0 or 1) in an array,
//        and continuing until the quotient becomes zero.

//        Print the binary equivalent
        System.out.println("Binary equivalent of " + decimal + " is: ");
        for(j = i-1; j>0; j--) {
            System.out.print(binary[j]);
        }
    }
}

/**Here's how the FOR loop works:
 j = i - 1: Initialize the loop counter j to the index of the last non-zero binary digit in the binary array.
 j > 0: Check if j is greater than zero. We stop at index 1, because the leading zero in binary numbers is typically omitted.
 j--: Decrement j by one in each iteration.
 System.out.print(binary[j]);: Print the binary digit at index j.
 By iterating over the binary array in reverse order, we print the binary digits in the correct order from left to right, without including any leading zeros.

 For example, if the binary digits stored in the binary array are {0, 1, 1, 0, 0, 1}, then the loop will print the binary equivalent as "11001". The loop starts with j set to 5 (the index of the last non-zero digit), and prints the digits at indices 5, 4, 3, 2, and 1 in that order. The resulting string of digits, "11001", is the binary equivalent of the original decimal number.
 *
 */


/**Explaining detail the loop:
 * -- For example. Let's convert the decimal number 25 to binary:
 * Divide 25 by 2. The quotient is 12 and the remainder is 1.
 * Write down 1 as the first binary digit.
 * Divide 12 by 2. The quotient is 6 and the remainder is 0.
 * Write down 0 as the second binary digit.
 * Divide 6 by 2. The quotient is 3 and the remainder is 0.
 * Write down 0 as the third binary digit.
 * Divide 3 by 2. The quotient is 1 and the remainder is 1.
 * Write down 1 as the fourth binary digit.
 * Divide 1 by 2. The quotient is 0 and the remainder is 1.
 * Write down 1 as the fifth binary digit.
 * The binary equivalent of 25 is 11001.
 *
 */

/** Alternatively, we can use Java code to convert a decimal number to binary using the formula:
 * int decimal = 25;   //the decimal number to convert
 * String binary = Integer.toBinaryString(decimal);
 * System.out.println("Binary equivalent of " + decimal + " is: " + binary);
 */