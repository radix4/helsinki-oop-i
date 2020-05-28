import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();

        words.add("One"); // this is [0]
        words.add("Two"); // [1]
        words.add("Three"); // [2]

        System.out.println(words.get(words.size() - 1));
    }
}
