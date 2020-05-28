package Enum;

public class Card {

    /*public static final int DIAMONDS = 0; //final = cant be changed
    public static final int SPADES = 1; // these are suits
    public static final int CLUBS = 2;
    public static final int HEARTS = 3; */
    //INSTEAD OF THIS DO

    private Suit suit;
    private int value;


    public Card(int value, Suit suit) { // classic constructor
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }


    //DON'T NEED THIS
    /*private String suitName() {
        if (suit == 0) {
            return "DIAMONDS";
        } else if (suit == 1) {
            return  "SPADES";
        } else if (suit == 2) {
            return "CLUBS";
        }
        return "HEARTS";
    }*/


    public Suit getSuit() {
        return suit;
    }

    public int getValue(){
        return value;
    }
}
