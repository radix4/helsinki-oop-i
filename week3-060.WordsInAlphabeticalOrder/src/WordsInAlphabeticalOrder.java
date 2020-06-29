/**
 * This program print words in alphabetical order.
 * @author  Thang Cao
 * @since   06/29/2020
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                break;
            }

            words.add(word);
        }
        Collections.sort(words);
        print(words);
    }

    public static void print(ArrayList<String> words) {
        for (String w : words) {
            System.out.println(w);
        }
    }
}
