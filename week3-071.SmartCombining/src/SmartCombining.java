/**
 * This program combines two lists into one, without repeat.
 * @author  Thang Cao
 * @since   07/04/2020
 * */

import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void smartCombine(ArrayList<Integer> one, ArrayList<Integer> two) {
        ArrayList<Integer> twoCopy = new ArrayList<>(two); // temp arrayList
        twoCopy.removeAll(one);  // remove duplicates
        one.addAll(twoCopy);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}
