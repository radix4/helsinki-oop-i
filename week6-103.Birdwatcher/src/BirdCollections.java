import java.util.ArrayList;

public class BirdCollections {
    private ArrayList<Bird> birds;

    public BirdCollections(){
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(Bird newBird){
        this.birds.add(newBird);
    }

    public void printBirds(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }






}
