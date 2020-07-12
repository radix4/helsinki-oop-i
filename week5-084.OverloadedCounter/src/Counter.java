public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int value) {
        this(value, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        if (value == 0) {
            return;
        }

        value--;
    }

}
