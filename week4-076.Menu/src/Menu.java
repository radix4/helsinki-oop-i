
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal){
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        for (String mealNames : this.meals){
            System.out.println(mealNames);
        }
    }

    public void clearMenu(){
        this.meals.removeAll(this.meals);
    }
    // add the methods here
}
