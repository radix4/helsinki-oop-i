public class Bird {
    private String name;
    private String latinName;

    //constructor
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = name;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public String toString(){
        return "Bird: " + this.name + " (" + this.latinName + ")";
    }

}
