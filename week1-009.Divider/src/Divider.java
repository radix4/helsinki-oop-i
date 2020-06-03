/** This program asks the user for 2 integers and prints their quotient
 * @author Thang Cao
 * @date 06/02/2020
 * */

import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        Double num1 = Double.parseDouble(reader.nextLine());
        System.out.print("Type a number: ");
        Double num2 = Double.parseDouble(reader.nextLine());
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1/num2));
    }
}
