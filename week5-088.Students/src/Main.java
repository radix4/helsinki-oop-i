/**
 * This program creates a list of students then find them using keywords.
 * @author  Thang Cao
 * @since   07/13/2020
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("student number: ");
            String number = reader.nextLine();
            list.add(new Student(name, number));
        }

        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println();

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");

        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}