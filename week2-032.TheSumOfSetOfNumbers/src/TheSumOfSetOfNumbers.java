
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int num = Integer.parseInt(reader.nextLine());

        int counter = 1;
        int sum = 0;

        while (counter <= num){
            sum += counter;
            counter++;
        }
        System.out.println("Sum is " + sum);


    }
}
