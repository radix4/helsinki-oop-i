/**
 * This program prints words in reverse order of an arraylist.
 * @author  Thang Cao
 * @since   06/28/2020
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                break;
            }

            list.add(word);
        }

        Collections.reverse(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
