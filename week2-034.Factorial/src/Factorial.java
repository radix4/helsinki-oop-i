/**
 * This program calculates the factorial of the number n.
 * @author  Thang Cao
 * @since   06/16/2020
 * */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int factorial = 1;

        /** 1 * 2 * 3 * 4 --> n = 4 */
        for (int i = 1; i <= n; i++) {
            factorial *=  i;
        }

        System.out.println("Factorial is " + factorial);
    }
}
