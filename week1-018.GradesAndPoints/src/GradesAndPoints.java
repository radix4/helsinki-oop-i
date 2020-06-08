/** This program gives course grade based on points [0-60]
 * @author  Thang Cao
 * @since   06/08/2020
 * */
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int point = Integer.parseInt(reader.nextLine());

        if (point <= 60 && point >= 50){
            System.out.println("Grade: 5");
        } else if (point < 50 && point >= 45){
            System.out.println("Grade: 4");
        }else if (point < 45 && point >= 40){
            System.out.println("Grade: 3");
        }else if (point < 40 && point >= 35){
            System.out.println("Grade: 2");
        }else if (point < 35 && point >= 30){
            System.out.println("Grade: 1");
        } else {
            System.out.println("Grade: failed");
        }
    }
}
