/** This program asks users for names and ages and prints the sum of their ages
 * @author Thang Cao
 * @date 06/04/2020
 * */


import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String firstPerson = reader.nextLine();
        System.out.print("Type your age:");
        int firstAge = Integer.parseInt(reader.nextLine());

        System.out.println();

        System.out.print("Type your name: ");
        String secondPerson = reader.nextLine();
        System.out.print("Type your age:");
        int secondAge = Integer.parseInt(reader.nextLine());

        System.out.println();

        System.out.println(firstPerson + " and " + secondPerson + " are " +
                (firstAge + secondAge) + " years old in total.");

    }
}
