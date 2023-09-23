import java.util.*;

class NumberGuessGame {
    int number;
    int remainingRounds = 5;

    public void NumberGuessGame() {
        Random random = new Random();
        this.number = random.nextInt(100); // Generates a random number between 0 and 99
        // this.remainingTries = maxTries;
    }

    public void playingGame() {
        Scanner scanner = new Scanner(System.in);

        while (remainingRounds > 0) {
            System.out.println("Guess the number (" + remainingRounds + " attempts remaining):");
            int userInput = scanner.nextInt();

            if (userInput == number) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (userInput < number) {
                System.out.println("Your guess is too small.");
            } else {
                System.out.println("Your guess is too large.");
            }

            remainingRounds--;
        }

        if (remainingRounds== 0) {
            System.out.println("Sorry, you've run out of attempts. correct number : " + number + " Try Luck.. Again..");
        }

        scanner.close();
    }
}

public class GuessNumber  {
    public static void main(String[] args) {
        NumberGuessGame game = new NumberGuessGame();
        game.playingGame();
    }
}