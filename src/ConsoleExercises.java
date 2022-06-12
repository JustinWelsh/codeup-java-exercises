import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {

/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
//        String userInput = scanner.next();
        String userInput = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <-");
*/


//========================================================================

//        TODO: EXERCISE Console IO (input / output)
//TODO 1.)
        double pi = 3.14159;

        //Write some Java code that uses the variable pi to output the following:
        //  "The value of pi is approximately 3.14".

        System.out.printf("The value of pi is approximately %.2f\n", pi); // %.2f = '2' decimal places. 'f' = float

//SCANNER CLASS.
        Scanner scanner = new Scanner(System.in);

        //TODO 1.)

//
//        System.out.println("Enter a integer");
//        int userIntInput = scanner.nextInt(); // if anything other that an 'int': Exception in thread error.
//        System.out.println("You entered: " + userIntInput);


    //TODO 2.)

        System.out.println("Enter 3 words");

        String firstWordInput = scanner.next();
        String secondWordInput = scanner.next();
        String thirdWordInput = scanner.next();

        System.out.printf("You entered:%n %s%n %s%n %s%n", firstWordInput,secondWordInput, thirdWordInput);



    }
}
