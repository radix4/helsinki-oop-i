
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        int result = 0;
        int counter = 0;

        while (counter <= num){
            result += (int)Math.pow(2, counter);
            counter++;
        }
        System.out.print("The result is " + result);
    }
}
