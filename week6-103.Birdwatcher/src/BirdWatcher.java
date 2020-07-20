import java.util.HashMap;
import java.util.Map;

public class BirdWatcher {
    private Map<Bird, Integer> birds;

    public BirdWatcher() {
        this.birds = new HashMap<>();
    }

    public void add(Bird bird){
        if (birds.containsKey(bird)) {
            return;
        }

        birds.put(bird, 0);
    }

    public void observation(String name){
        for (Bird b : birds.keySet()){
            if (b.getName().equals(name)){
                birds.put(b, birds.get(b) + 1);
                return;
            }
        }

        System.out.println("Is not a bird!");
    }

    public void statistics(){
        for (Bird b : birds.keySet()){
            System.out.println(b + ": " + birds.get(b) + " observations");
        }
    }

    public void show(String name) {
        for (Bird b : birds.keySet()){
            if (b.getName().equals(name)){
                System.out.println(b + ": " + birds.get(b) + " observations");
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}
