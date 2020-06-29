/**
 * This program returns the number of items in a list.
 * @author  Thang Cao
 * @since   06/29/2020
 * */

import java.util.ArrayList;
import java.util.List;

public class NumberOfItems {

    public static int countItems(ArrayList<String> list){
        return list.size();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
         System.out.println(countItems(list));
    }

}
