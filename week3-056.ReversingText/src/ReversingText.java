/**
 * This program reverse the given String.
 * @author  Thang Cao
 * @since   06/27/2020
 * */
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        StringBuilder reverse = new StringBuilder(text).reverse();

        return reverse.toString();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
