/**
 * This program implements a clock.
 * @author  Thang Cao
 * @since   07/08/2020
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int sek = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int min = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int hou = Integer.parseInt(reader.nextLine());

        seconds.setValue(sek);
        minutes.setValue(min);
        hours.setValue(hou);

        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }

            i++;
        }
    }
}
