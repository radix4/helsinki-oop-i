/**
 * This program sorts an array.
 * @author  Thang Cao
 * @since   07/20/2020
 * */

public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int theIndexOfSmallest = 0;

        for (int i = 0; i < array.length; i++) {
            if ( array[i]<array[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }

        return theIndexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startIndex) {
        int theIndexOfSmallest = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if ( array[i]<array[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }

        return theIndexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int index1OldValue = array[index1];
        array[index1] = array[index2];
        array[index2] = index1OldValue;
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int theIndexOfTheSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, theIndexOfTheSmallest);
        }
    }

}

