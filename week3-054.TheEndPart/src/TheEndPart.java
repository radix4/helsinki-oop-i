/**
 * This program prints the end of a word.
 * @author  Thang Cao
 * @since   06/26/2020
 * */
import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        int lastIndex = word.length();

        System.out.print("Result: " + word.substring(lastIndex - length, lastIndex));
    }
}
