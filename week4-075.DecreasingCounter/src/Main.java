/**
 * This program implements the DecreasingCounter class.
 * @author  Thang Cao
 * @since   07/06/2020
 * */

public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
