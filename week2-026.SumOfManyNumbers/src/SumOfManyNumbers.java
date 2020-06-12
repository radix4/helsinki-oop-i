/** This program reads numbers from user and prints their sum
 * @author  Thang Cao
 * @since   06/10/2020
 * */
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            sum += read;

            System.out.println("Sum now: " + sum);
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}
