import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean talkingToBob = true;
        System.out.println("\nConversation with Bob:\nto stop talking with Bob say \"gotta go\"");

        do {
            String userInput = scan.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userInput.equalsIgnoreCase("gotta go")){
                System.out.println("Ok bye.");
                talkingToBob = false;
            } else  {
                System.out.println("Whatever.");
            }
        } while (talkingToBob);

    }
}
