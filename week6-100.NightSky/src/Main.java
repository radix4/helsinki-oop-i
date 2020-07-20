/**
 * This program stimulates a night sky with stars by printing.
 * @author  Thang Cao
 * @since   07/19/2020
 * */

public class Main {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}