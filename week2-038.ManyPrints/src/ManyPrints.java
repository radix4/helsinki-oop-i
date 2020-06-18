/**
 * This program asks the user how many times the text should be printed.
 * @author  Thang Cao
 * @since   06/18/2020
 * */
import java.util.Scanner;

public class ManyPrints {
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many?");
        int n = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < n; i ++) {
            printText();
        }
    }
}
