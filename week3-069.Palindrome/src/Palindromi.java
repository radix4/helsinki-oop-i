/**
 * This program checks if a string is a palindrome (reads the same forward and backward)
 * @author  Thang Cao
 * @since   07/03/2020
 * */

import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text){
        StringBuilder reverse = new StringBuilder(text);
        reverse.reverse();

        return reverse.toString();
    }

    public static boolean palindrome(String text) {
        return text.equals(reverse(text));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
