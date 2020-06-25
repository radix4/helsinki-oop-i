/**
 * This program prints the first part of a word.
 * @author  Thang Cao
 * @since   06/25/2020
 * */
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        char[] chars = word.toCharArray();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());


        System.out.print("Result: ");
        for (int i = 0; i < length; i++){
            System.out.print(chars[i]);
        }
    }
}
