/**
 * This program implements a simple information system prototype for a library.
 * @author  Thang Cao
 * @since   07/19/2020
 * */

public class Main {
    public static void main(String[] args) {
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());

        System.out.println(cheese);
    }
}
