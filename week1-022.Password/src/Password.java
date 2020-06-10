/** This program asks for the user's password, reveal secret if password is right.
 * @author  Thang Cao
 * @since   06/10/2020
 * */
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true){
            System.out.print("Type the password: ");
            String compare = reader.nextLine();

            if (compare.equals(password)){
                System.out.println("Right!\n");
                System.out.println("The secret is: jryy qbar!");
                break;
            }

            System.out.println("Wrong!");

        }
    }
}
