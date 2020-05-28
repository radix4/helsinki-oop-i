import java.util.Scanner;
import java.util.*;

public class Palindromi {

    public static String reverseText(String text){
        int i = text.length()-1;
        String reversed = "";
        while (i>=0){
            reversed +=text.charAt(i);
            i--;
        }
        return reversed;
    }

    public static boolean palindrome(String text) {
        if(text.equals(reverseText(text))){
            return true;
        }
        return false;
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
