
import java.util.*;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            words.add(word);
            if (word.isEmpty()) {
                Collections.sort(words);
                System.out.println("You typed the following words: ");
                for (String names : words) {
                    System.out.println(names);
                }
                break;
            }
        }
    }
}
