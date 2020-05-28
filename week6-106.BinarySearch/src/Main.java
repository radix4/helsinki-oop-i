
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] values = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader= new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(values));
        System.out.println();

        System.out.print("Enter searched number: ");
        String input = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(values, Integer.parseInt(input));

        // Print here the result
        System.out.println(result);
    }
}
