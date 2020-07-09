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

    public String toString() {

        return "Value: " + value;
    }
}