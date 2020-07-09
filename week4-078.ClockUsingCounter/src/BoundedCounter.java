public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        if (value == upperLimit){
            value = 0;
            return;
        }

        value++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {
            return;
        }

        this.value = value;
    }


    public String toString() {
        if (value < 10){
            return "0" + value;
        }

        return "" + value;
    }
}