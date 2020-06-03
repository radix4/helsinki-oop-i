/** This program calculates the circumferience of the circle
 * @author Thang Cao
 * @date 06/03/2020
 * */
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");

        double radius = Double.parseDouble(reader.nextLine());
        double pi = Math.PI;
        double circumference = 2 * pi * radius;

        System.out.println();
        System.out.println("Circumference of the circle: " + circumference);
    }
}
