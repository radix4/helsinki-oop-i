/**
 * This program implements a method that prints a line with stars.
 * @author  Thang Cao
 * @since   07/18/2020
 * */

public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int i = 0; i < array.length; i++) {
            int numberOfStars = array[i];

            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
