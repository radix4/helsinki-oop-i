/**
 * This program asks the user to input words until the user gives the same word twice.
 * @author  Thang Cao
 * @since   06/28/2020
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)){
                System.out.println("You gave the word " + word + " twice");
                break;
            }

            words.add(word);
        }
        
    }
}
