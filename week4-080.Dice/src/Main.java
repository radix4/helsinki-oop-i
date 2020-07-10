/**
 * This program implements a dice.
 * @author  Thang Cao
 * @since   07/09/2020
 * */
public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(6);

        int i = 0;
        while (i < 10) {
            System.out.println(dice.roll());
            i++;
        }

    }
}
