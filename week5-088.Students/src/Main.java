
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String name;
        String studentID;

        while(true) {
            System.out.print("Name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            studentID = reader.nextLine();

            Student pekka = new Student(name, studentID);
            list.add(pekka);
        }
        for ( Student listo : list){
            System.out.println(listo);
        }

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();

        System.out.println("Result:");

        for ( Student listo : list){

            if (listo.getName().contains(searchTerm)){
                System.out.println(listo);
            }
        }



    }
}
