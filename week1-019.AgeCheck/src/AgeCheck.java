/** This program checks if someone's age is reasonable (between 0 and 120)
 * @author  Thang Cao
 * @since   06/08/2020
 * */
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 0 && age <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
