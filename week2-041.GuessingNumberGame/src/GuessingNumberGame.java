
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        int guessCount = 1;
        System.out.print("Guess a number:");
        int guessNumber = Integer.parseInt(reader.nextLine());
        while (guessNumber != numberDrawn) {
            if (guessNumber < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guessCount);
            } else if (guessNumber > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guessCount);
            }
            System.out.print("Guess a number:");
            guessNumber = Integer.parseInt(reader.nextLine());
            guessCount++;
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
