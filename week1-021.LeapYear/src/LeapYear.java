import java.util.Scanner;

public class LeapYear {
        public static void main(String[] args){
            System.out.print("Type a year: ");
            Scanner scanner = new Scanner(System.in);
            int year = Integer.parseInt(scanner.nextLine());


            if (year % 100 == 0 && year % 400 == 0){
                System.out.println("This is a leap year.");
            } else if (year % 4 == 0 && year % 100 != 0){
                System.out.println("This is a leap year.");
            } else {
                System.out.println("This is not a leap year.");
            }


        }

}
