/**
 * This program asks for the user's name and prints it in reverse.
 * @author  Thang Cao
 * @since   06/25/2020
 * */

import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        StringBuilder name = new StringBuilder(reader.nextLine());

        System.out.println("In reverse order: " + name.reverse());
    }
}
