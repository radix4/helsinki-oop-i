/**
 * This program demonstrates the functions of a ArrayList data structure.
 * @author  Thang Cao
 * @since   06/27/2020
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            }

            words.add(word);
        }

        for (String w : words) {
            System.out.println(w);
        }
    }
}
