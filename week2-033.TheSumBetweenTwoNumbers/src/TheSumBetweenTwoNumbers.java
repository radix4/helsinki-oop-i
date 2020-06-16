/**
 * This program calculates the sum from lower to upper bound.
 * @author  Thang Cao
 * @since   06/14/2020
 * */

import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int lowerBound = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int upperBound = Integer.parseInt(reader.nextLine());
        int sum = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
