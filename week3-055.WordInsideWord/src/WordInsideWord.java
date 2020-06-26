/**
 * This program checks if the 2nd word is in the first word.
 * @author  Thang Cao
 * @since   06/26/2020
 * */
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String first = reader.nextLine();
        System.out.print("Type the second word: ");
        String second = reader.nextLine();

        if (first.contains(second)) {
            System.out.println("The word '" + second + "' is found in the word '" +
                    first + "'.");
        } else {
            System.out.println("The word '" + second + "' is not found in the word '" +
                    first + "'.");
        }
    }
}
