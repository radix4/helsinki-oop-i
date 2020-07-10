import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String characters = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder password = new StringBuilder("");
        int numberOfCharacters = this.length;

        while (numberOfCharacters > 0) {
            int random = this.random.nextInt(characters.length());
            char c = characters.charAt(random);
            password.append(c);
            numberOfCharacters--;
        }

        return password.toString();
    }
}
