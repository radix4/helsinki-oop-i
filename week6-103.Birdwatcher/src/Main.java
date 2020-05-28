import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdCollections collections = new BirdCollections();

        printCommands();
        String command = reader.nextLine();

        while (true){
            if (command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){

                printAdd();
                String name = reader.nextLine();
                printLatin();
                String latinName = reader.nextLine();
                Bird bird = new Bird(name,latinName);


                collections.addBird(bird);
                System.out.print("? ");
                command = reader.nextLine();
            }
            if(command.equals("Observation")){
               // System.out.println("What was observed:?");
               // String birdName = reader.nextLine();
                for (BirdCollections bird : collections){

                }

            }

        }

        collections.printBirds();

    }

    public static void printAdd(){
        System.out.print("Name: ");
    }
    public static void printLatin(){
        System.out.print("Latin name: ");
    }
    public static void printCommands(){
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("Statistics - prints all the birds");
        System.out.println("Show - prints one bird");
        System.out.println("Quit - terminates the program");
        System.out.println();
        System.out.println("? ");
    }

}
