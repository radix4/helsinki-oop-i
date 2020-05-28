import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
            String password = "";
            int i = 0;
            while (i < this.length){
                password += "abcdefghijklmnopqrstuvwxyz".charAt(1 + this.random.nextInt(25));
                i++;
            }

            return password;



    }
}
