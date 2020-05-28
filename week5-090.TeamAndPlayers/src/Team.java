import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    //constructor
    public Team(String name){
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public void addPlayer(Player player){
        if(this.players.size() >= this.maxSize){
            return;
        }

        this.players.add(player);
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.players.size();
    }

    public int goals(){
        int totalGoals = 0;
        for ( Player player : players){
            totalGoals += player.goals();
        }

        return totalGoals;
    }

    public void printPlayers(){
        for (Player player : players) {
            System.out.println(player.getName() + ", goals " + player.goals());
        }
    }

}
