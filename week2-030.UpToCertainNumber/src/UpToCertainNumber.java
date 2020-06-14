/**
 * This program prints whole numbers from 1 to the number user enters.
 * @author  Thang Cao
 * @since   06/14/2020
 * */

import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int upperBound = Integer.parseInt(reader.nextLine());

        for (int i = 1; i <= upperBound; i++) {
            System.out.println(i);
        }
        
    }
}
