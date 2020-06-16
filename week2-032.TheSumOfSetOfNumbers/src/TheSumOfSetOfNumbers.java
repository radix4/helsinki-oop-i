/**
 * This program calculates the sum to the number the user enters.
 * @author  Thang Cao
 * @since   06/15/2020
 * */

import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    /** 1 + 2 + 3 + ... + n. */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
