/** This program compares 2 numbers then prints the bigger
 * @author  Thang Cao
 * @since   06/07/2020
 * */

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        System.out.println();

        if (num1 == num2){
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number: " + Math.max(num1, num2));
        }
    }
}
