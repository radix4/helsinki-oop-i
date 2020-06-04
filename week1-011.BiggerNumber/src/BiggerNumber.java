/** This program asks the user for 2 ints and prints the larger
 * @author Thang Cao
 * @date 06/04/2020
 * */


import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        System.out.println("The bigger number of the two numbers given was: "
                + Math.max(num1,num2));
    }
}
