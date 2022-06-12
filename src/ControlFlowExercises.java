import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String[] args) {

//       TODO: ========== EXERCISE ==========

//        TODO: Loop Basics
    //While
//        int i = 5;
//        while (i < 15) {
//            i++;
//            System.out.println(i);
//        }

    //Do while
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100); // Counts to 100 by 2s, starting at 0.

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10); // starts at 100 and counts down by 5s to -10.

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while(i <= 100000); // type needs to be 'long'

    //for loop
//        System.out.println("For loop refactored results:");
//        for (long i = 2; i < 100000; i *= i) {
//            System.out.println(i);
//        }

//        TODO: Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz        (" + i + " 'multiple of 15')");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz        (" + i + " 'multiple of 5')");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz        (" + i + " 'multiple of 3')");
//            } else {
//                System.out.println(i);
//            }
//        }

//        TODO: Display a table of powers.
        //Prompt the user to enter an integer.
        Scanner scan = new Scanner(System.in);

//        String userInput;
//        do {
//        System.out.println("\nEnter an integer: ");
//        int userIntInput = scan.nextInt();
//        System.out.println("\nYou chose " + userIntInput);
//        System.out.println("\nHere is your table!");
//
////        //TABLE:
//        System.out.printf("%nnumber | squared | cubed%n------ | ------- | -----%n");
//
//            for (int i = 1; i <= userIntInput; i++) {
//                int square = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%d      | %d       | %d%n", i, square, cubed);
//            }
//
//        System.out.print("\nContinue? [y/N] ");
//        userInput = scan.next();
//        } while (userInput.equals("y"));


//        TODO: Convert given number grades into letter grades.
        String confirmation;
        do {
        System.out.println("\nenter a number from 0 - 100.");
        int userNum = scan.nextInt();
//        if (userNum < 60) {
//            System.out.printf("%d = F",userNum);
//        } else if (userNum < 67) {
//            System.out.printf("%d = D",userNum);
//        } else if (userNum < 80) {
//            System.out.printf("%d = C",userNum);
//        } else if (userNum < 88) {
//            System.out.printf("%d = B",userNum);
//        } else if (userNum <= 100) {
//            System.out.printf("%d = A",userNum);
//        }

        if (userNum < 60) {
            System.out.printf("%d = F",userNum);
        } else if (userNum < 65) {
            System.out.printf("%d = D-",userNum);
        } else if (userNum < 70) {
            System.out.printf("%d = D+",userNum);
        } else if (userNum < 75) {
            System.out.printf("%d = C-",userNum);
        } else if (userNum < 80) {
            System.out.printf("%d = C+",userNum);
        } else if (userNum < 85) {
            System.out.printf("%d = B-",userNum);
        } else if (userNum < 90) {
            System.out.printf("%d = B+",userNum);
        } else if (userNum < 95) {
            System.out.printf("%d = A-",userNum);
        } else if (userNum <= 100) {
            System.out.printf("%d = A+",userNum);
        }
        System.out.println("\nwant to enter another number? [y/n]");
        confirmation = scan.next();

        } while (confirmation.equals("y"));


//        TODO: **Bonus

    }
}
