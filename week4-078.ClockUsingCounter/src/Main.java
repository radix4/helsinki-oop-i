/**
 * This program implements a clock.
 * @author  Thang Cao
 * @since   07/08/2020
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BoundedCounter counter = new BoundedCounter(14);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 16){
            counter.next();
            System.out.println("value: " + counter );
            i++;
        }
    }
}
