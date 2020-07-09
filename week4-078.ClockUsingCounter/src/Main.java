/**
 * This program implements a clock.
 * @author  Thang Cao
 * @since   07/08/2020
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            minutes.next();
            if (minutes.getValue() == 59) {
                hours.next();
            }
            i++;
        }
    }
}
