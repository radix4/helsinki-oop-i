public class Main {
    public static void main(String[] args) {
        // write test code here
        Counter counter = new Counter(3);
        counter.decrease();
        System.out.println(counter);
        counter.increase();
        System.out.println(counter);
        counter.increase(15);
        System.out.println(counter);

    }
}
