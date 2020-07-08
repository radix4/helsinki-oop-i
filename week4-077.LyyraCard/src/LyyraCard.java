public class LyyraCard {
    private double balance;
    private final double ECONOMICAL = 2.5;
    private final double GOURMET = 4.0;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= ECONOMICAL) {
            this.balance -= ECONOMICAL;
        }
    }

    public void payGourmet() {
        if (this.balance >= GOURMET) {
            this.balance -= GOURMET;
        }
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
