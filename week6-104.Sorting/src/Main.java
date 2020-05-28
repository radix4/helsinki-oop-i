import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array){
        int smallestValue = array[0];

        for (int i = 1; i < array.length; i++ ){
            if (smallestValue > array[i]){
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        int smallestValue = array[0];

        for (int i = 1; i < array.length; i++ ){
            if (smallestValue > array[i]){
                smallestValue = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfSmallestStartingFrom = index;
        int smallestValue = array[index];

        for (int i = index; i < array.length; i++ ){
            if (smallestValue > array[i]){
                smallestValue = array[i];
                indexOfSmallestStartingFrom = i;
            }
        }
        return indexOfSmallestStartingFrom;
    }
    public static void swap(int[] array, int index1, int index2){
        int dummy1 = array[index1];
        array[index1] = array[index2];
        array[index2] = dummy1;
    }

    public static void sort(int[] array){
        int index;
        int smallest = smallest(array);
        int indexOfTheSmallest = indexOfTheSmallest(array);

        for (index = 0 ;index < array.length; index++) {
            int indexOfTheSmallestStartingFrom = indexOfTheSmallestStartingFrom(array, index);
            swap(array, index, indexOfTheSmallestStartingFrom);
        }



        System.out.println(Arrays.toString(array));

    }
}
