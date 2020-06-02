/** This program asks the user for 2 integers then prints their sum
 * @author Thang Cao
 * @date 06/02/2020
 * */

import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Type aother number: ");
        int secondNum = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of the numbers: " + (firstNum + secondNum));
    }
}
