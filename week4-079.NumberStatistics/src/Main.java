/**
 * This program implements a couple of simple arithmetic functions.
 * @author  Thang Cao
 * @since   07/08/2020
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
    }
}
