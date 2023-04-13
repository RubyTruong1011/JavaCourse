import java.util.Scanner;

public class Exercise4 {
//  Write a program to count the letters, spaces, numbers
//  and other characters of an input string.

// => How to get a string from the user
// and count the spaces, letters, numbers and other character of this string
public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input_String = s1.nextLine();  //Store that input into a string
        count(input_String);
    }

    public static void count(String x) {
        char[] ch = x.toCharArray();   //create a char array and examine every single character inside
        int letter = 0, space = 0, num = 0, others = 0;

        for(int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                others++;
            }}

//Display the result
            System.out.println("Letters: " + letter);
            System.out.println("Numbers: " + num);
            System.out.println("Spaces: " + space);
            System.out.println("Others: " + others);
        }
}
//A for loop is then used to iterate through each character in the input string.
// For each character, the program uses the isLetter(), isDigit(), and isSpaceChar() methods
// of the Character class to check whether the character is a letter, digit, or space, respectively.
// If none of these conditions are met, the character is assumed to be an "other" character.
//
//Depending on the type of character, the program increments the appropriate counter variable (letter, space, num, or others) by 1.

