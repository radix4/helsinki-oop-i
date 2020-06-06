/** This program tells if a number is positive
 * @author  Thang Cao
 * @since   06/05/2020
 * */
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        System.out.println();

        if (num > 0) {
            System.out.println("The number is a positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
