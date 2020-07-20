import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private BirdWatcher watch;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.watch = new BirdWatcher();
        start();
    }

    public void start(){

        while (true){
            System.out.print("? ");
            String command = reader.nextLine();

            if (command.equals("Quit")){
                return;
            }

            if (command.equals("Add")){
                add();
            } else if (command.equals("Observation")){
                observation();
            } else if (command.equals("Statistics")) {
                watch.statistics();
            } else if (command.equals("Show")) {
                show();
            }
        }
    }

    public void add(){
        System.out.print("Name: ");
        String name = reader.nextLine();

        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        Bird b = new Bird(name,latinName);

        watch.add(b);
    }

    public void observation() {
        System.out.print("What was observed:? ");
        String name = reader.nextLine();

        watch.observation(name);
    }

    public void show() {
        System.out.print("What? ");
        String name = reader.nextLine();

        watch.show(name);
    }

}
