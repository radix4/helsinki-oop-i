/**
 * This program implements a simple phone book.
 * @author  Thang Cao
 * @since   07/16/2020
 * */


public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );
    }
}
