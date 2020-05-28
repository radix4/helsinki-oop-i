public class Player {
    private String name;
    private int amountOfGoals;

    // 2 Constructors
    public Player(String name){
        this(name, 0);
    }

    public Player(String name, int amountOfGoals){
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }

    // 2 Getters
    public String getName(){
        return this.name;
    }

    public int goals(){
        return this.amountOfGoals;
    }

    //toString
    public String toString(){
        return getName() + ", goals " + this.amountOfGoals;
    }
}
