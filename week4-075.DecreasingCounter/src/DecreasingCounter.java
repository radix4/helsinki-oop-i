public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value == 0) {
            return;
        }
        value--;
    }

    public void reset(){
        value = 0;
    }

    // and here the rest of the methods
}
