/**
 * This program asks for the user's name and gives its first 3 characters.
 * @author  Thang Cao
 * @since   06/24/2020
 * */

import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();


        if (name.length() > 2) {
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". character: " + name.charAt(i));
            }
        }
    }
}
