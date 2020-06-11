/** This program asks the user for 3 numbers and prints their sum.
 * @author  Thang Cao
 * @since   06/11/2020
 * */

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        for (int i = 0; i < 3; i++){
            if (i == 0) {
                System.out.print("Type the first number: ");
            } else if (i == 1) {
                System.out.print("Type the second number: ");
            } else {
                System.out.print("Type the third number: ");
            }

            read = Integer.parseInt(reader.nextLine());

            sum += read;
        }

        System.out.println("Sum: " + sum);
    }
}
