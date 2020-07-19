import java.util.Arrays;

/**
 * This program reverses an array.
 * @author  Thang Cao
 * @since   07/18/2020
 * */

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copy
        copied[0] = 99;

        // printing both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " +Arrays.toString(copied));

        System.out.println("");

        int[] reversed = reverseCopy(original);

        // printing both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reversed));
    }

    public static int[] copy(int[] array){
        int[] copy = new int[array.length];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static int[] reverseCopy(int[] array){
        int[] reversed = new int[array.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = array[array.length-1-i];
        }

        return reversed;
    }
    
}
