

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

        int sum = 0;
        int count = 0;
        while (true) {
            int n = Integer.parseInt(reader.nextLine());

            if (n == -1) {
                break;
            }

            sum += n;
            count++;
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
    }
}
