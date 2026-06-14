/*

* Jordyn Rylander
* MODULE 2.2
* Rock Paper Scissors Game
  */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

// Generate a random choice for the computer (1-3)
        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

// Prompt the user for their choice
        System.out.print("Enter your choice (1-3): ");
        int userChoice = input.nextInt();

// Get the move names for both computer and user choices
        String computerMove = getMoveName(computerChoice);
        String userMove = getMoveName(userChoice);

        System.out.println("Computer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

// Determine the winner
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        } else if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }

// Convert choice number to move name
    public static String getMoveName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid";
        }
    }
}
