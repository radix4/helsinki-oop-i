/**
 * This program calculates the sum of the powers, with base = 2.
 * @author  Thang Cao
 * @since   06/16/2020
 * */

import java.util.Scanner;

public class SumOfThePowers {

    /** 2^4 = 2 * 2 * 2 * 2. */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (int)Math.pow(2,i);
        }

        System.out.println("The result is " + sum);
    }
}
