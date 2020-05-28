public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        this(startingValue,false);
    }

    public Counter(boolean check){
        this(0, true);
    }

    public Counter(){
        this(0, false);
    }

    public int value(){
        return this.number;
    }

    public void increase(){
        this.number++;
    }

    public void decrease(){
        if(check){
            if (this.number > 0){
                this.number--;
            }
        } else {
            this.number--;
        }
    }

    public void increase(int increaseAmount){
        if (increaseAmount >= 0) {
            this.number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount){
        if (decreaseAmount > 0) {
            if (check) {
                if (decreaseAmount <= this.number) {
                    this.number -= decreaseAmount;
                } else {
                    this.number = 0;
                }
            }else {
                this.number -= decreaseAmount;
            }
        }
    }

    public String toString(){
        return "Value: " + this.number;
    }
}
