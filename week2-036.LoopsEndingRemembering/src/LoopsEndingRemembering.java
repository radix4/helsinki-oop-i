

/**
 * This program demonstrates the uses of different features of a loop.
 * @author  Thang Cao
 * @since   06/14/2020
 * */

import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers:");
        while (true) {
            int n = Integer.parseInt(reader.nextLine());

            if (n == -1) {
                break;
            }
        }

        System.out.println("Thank you and see you later!");
    }
}
