
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happen
        // if the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters

        if (this.guessedLetters.contains(letter)) {
            return;
        } else if (!this.word.contains(letter)){
            this.numberOfFaults++;
        }

        if(!this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
        }

    }





    public String hiddenWord() {
        // program here the functionality for building the hidden word
        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word
        // return the hidden word at the end


        String aString = "";
        char c;
        int i = 0;
        String hiddenWord = "";


        while (i < this.word.length()){
            c = this.word.charAt(i);
            aString = "" + c;
            if(this.guessedLetters.contains(aString)){
                hiddenWord += aString;
            } else {
                hiddenWord += "_";
            }
            aString = "";
            i++;
        }


        return hiddenWord;
    }
}
