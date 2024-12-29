import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (!isValidChoice(userChoice)) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = getChoiceString(computerChoiceIndex);

            System.out.println("Computer chose: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String getChoiceString(int index) {
        switch (index) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid";
        }
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice.toLowerCase())) {
            return "It's a draw!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("Rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("Paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
