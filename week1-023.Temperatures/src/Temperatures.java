/** This program draws a graph based on daily temperature.
 * @author  Thang Cao
 * @since   06/10/2020
 * */
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a temperature (-99 to quit): ");
            double temp = Double.parseDouble(reader.nextLine());

            if (temp == -99){
                break;
            }

            if (temp > -30 && temp < 40) {
                Graph.addNumber(temp);
            }
        }
    }
}
