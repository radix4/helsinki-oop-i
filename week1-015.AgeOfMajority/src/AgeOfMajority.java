/** This program asks for the user's age and tells whether the user has reached
 * the age of majority (i.e. 18 years old or older)
 * @author  Thang Cao
 * @since   06/06/2020
 * */
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 18) {
            System.out.println("\nYou have reached the age of majority!");
        } else {
            System.out.println("\nYou have not reached the age of majority yet!");
        }
    }
}
