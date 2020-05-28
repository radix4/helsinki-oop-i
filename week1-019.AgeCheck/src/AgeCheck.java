
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.parseInt(one.nextLine());

        if (age >= 0 && age <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }


    }
}
