import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            words.add(word);
            if (word.isEmpty()) {
                Collections.reverse(words);
                System.out.println("You typed the following words: ");
                for (String names : words) {
                    System.out.println(names);
                }
                break;
            }
        }
    }
}
