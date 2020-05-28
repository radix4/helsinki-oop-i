public class LyyraCard {
    private double balance;

    //constructor w/ double balanceAtStart
    public LyyraCard(double balanceAtStart){
       this.balance = balanceAtStart;
    }

    //toString
    public String toString(){
        return "The card has " + this.balance + " euros";
    }

    //pays 2.50 euros
    public void payEconomical(){
        if(this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    //pays 4.00 euros
    public void payGourmet(){
        if(this.balance >= 4.0) {
            this.balance -= 4.0;
        }
    }

    //adds money to card
    public void loadMoney(double amount){
        if (this.balance + amount>=150 && amount>0){
            this.balance = 150;
        }
        else if(amount>0) {
            this.balance +=amount;
        }
    }
}
