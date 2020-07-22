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

    public static int indexOfTheSmallest(int[] table) {
        int theIndexOfSmallest = 0;

        for (int i = 0; i < table.length; i++) {
            if ( table[i]<table[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }

        return theIndexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] table, int startIndex) {
        int theIndexOfSmallest = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if ( table[i]<table[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }

        return theIndexOfSmallest;
    }


}

