import java.util.Scanner;

public class AdventureGame {
    public static String getUserName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter player name: ");
        String playerName = scan.nextLine();
        return playerName;
    }

    public static void greetUser(String user) {
        System.out.printf("\nHello %s!\n", user);
        System.out.println("\tThis is not so much of an \"Adventure Game\" " +
                "but rather a good ol' game of\nROCK, PAPER, SCISSORS!\n");
    }


    public static void gamePrompt() {
        Scanner sc = new Scanner(System.in);

        boolean gamePlayDecision = true;
        do {
            System.out.println("Ready to play? [y/n]");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("\nCool!\n" +
                        "Now see if you beat the computer by selecting your move from below.\n");
                renderGame();
            } else if (userInput.equalsIgnoreCase("n")) {
                System.out.println("\n\nMaybe next time!\n\n");
            } else {
                System.out.println("invalid entry");
                gamePlayDecision = false;
            }
        } while (!gamePlayDecision);
    }


    public static void renderGame() {
        Scanner sc = new Scanner(System.in);

        boolean gameStarted = true;
        do {
            System.out.println("(to end the game press\"q\")");
            System.out.println("Select your move: ");
            System.out.println("\tr = Rock | p = Paper | s = Scissors\n");
            String playerMove = sc.nextLine();
            String computerMove = "p"; //Make this random

            if (playerMove.equals(computerMove)) {
                System.out.println("Tie game!");
            } else if (playerMove.equalsIgnoreCase("r") && computerMove.equalsIgnoreCase("s")) {
                System.out.println("you win: rock beats scissors\n");
            } else if (playerMove.equalsIgnoreCase("p") && computerMove.equalsIgnoreCase("r")) {
                System.out.println("you win: paper beats rock\n");
            } else if (playerMove.equalsIgnoreCase("s") && computerMove.equalsIgnoreCase("p")) {
                System.out.println("you win: scissors beats paper\n");
            } else if (playerMove.equalsIgnoreCase("q")) {
                System.out.println("\n\nGood game!\n\n");
                gameStarted = false;
            } else {
                if (!playerMove.equalsIgnoreCase("r") && !playerMove.equalsIgnoreCase("p") && !playerMove.equalsIgnoreCase("s") && !playerMove.equalsIgnoreCase("q")) {
                    System.out.println("invalid input");
                } else {
                    System.out.println("WASTED.");
                }
            }

        } while (gameStarted);
    }


//public static String getComputerMove() {
//    String computermove;
//    Random random = new Random();
//    int input = random.nextInt(3) + 1;
//
//    return computermove
//}

//===================== MAIN =====================
    public static void main (String[] args) {
        greetUser(getUserName());
        gamePrompt();



    }
}
