
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet(); //buys gourment lunch
        cardBrian.payEconomical(); //buys economical lunch

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20); //add 20 euros to cardPekka
        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();

        cardBrian.loadMoney(50);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);



    }
}
