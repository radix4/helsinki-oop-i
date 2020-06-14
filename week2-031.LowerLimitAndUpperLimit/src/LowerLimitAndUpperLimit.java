/**
 * This program asks user for first number and last number
 * then prints all in between.
 * @author  Thang Cao
 * @since   06/14/2020
 * */

import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        for (int i = first; i <= last; i++) {
            System.out.println(i);
        }
    }
}
