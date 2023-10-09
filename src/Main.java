import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean again;
        String playAgain;
        do {
            String player1 = getValidMove(scanner, "Player one enter your move [R P S]: ");
            String player2 = getValidMove(scanner, "Player two enter your move [R P S]: ");

            if (player1.equalsIgnoreCase("R")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock it's a tie!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, PlayerTwo wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors, PlayerOne Wins!");
                } else {
                    System.out.println("Please pick a valid option");
                }
            } else if (player1.equalsIgnoreCase("P")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, PlayerOne wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper is a Tie!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper, PlayerTwo Wins!");
                } else {
                    System.out.println("Please pick a valid option");
                }
            } else if (player1.equalsIgnoreCase("S")) {
                if (player2.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, PlayerTwo wins!");
                } else if (player2.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, PlayerOne wins!");
                } else if (player2.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors is a tie!");
                } else {
                    System.out.println("Please pick a valid option.");
                }
            } else {
                System.out.println("Please pick a valid option.");
            }

            System.out.println("Play again [Y/N]:");
            playAgain = scanner.nextLine();
            again = playAgain.equalsIgnoreCase("Y");
            if (!again) {
                System.out.println("Exiting");
            }
        } while (again);
    }

static String getValidMove(Scanner scanner, String prompt) {
        String move;
        do {
            System.out.print(prompt);
            move = scanner.nextLine();
            if (!(move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S"))) {
                System.out.println("Invalid move. Please enter R, P, or S.");
            }
        } while (!(move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S")));
        return move;
    }
}
