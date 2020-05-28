public class Product {
    private String name;
    private double price;
    private int amount;

    // creates a constructor Product with 3 parameters
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount= amountAtStart;
    }

    public void printProduct(){
        System.out.println(this.name+", price "+this.price +" , amount " + this.amount);
    }
}
