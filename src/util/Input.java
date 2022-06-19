package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);       //I thought new instances needed to be the same name as the class?

    public String getString() {
        System.out.println("Enter a string");
        return scanner.nextLine();
    }


    public boolean yesNo() {
        System.out.println("yes or no?");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") ||
            userInput.equalsIgnoreCase("yes") ||
            userInput.equalsIgnoreCase("yeah") ||
            userInput.equalsIgnoreCase("ye") ||
            userInput.equalsIgnoreCase("ya")) {
            return true;
        }
        return false;
    }


    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d - %d.\n", min, max);
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getInt(min, max);
    }

     public int getInt() {
         System.out.printf("Enter a number\n");
         int userNum = scanner.nextInt();
         return userNum;
    }
    public double getDouble(double min, double max) {
        System.out.printf("Enter a large decimal number between %f - %f\n", min, max);
        double userNum = scanner.nextDouble();
        if (userNum >= min && userNum <= max) {
            return userNum;
        } return getDouble(min, max);

    }

    public double getDouble() {
        System.out.printf("Enter a decimal number before I turn green. .\n");
        double userNum = scanner.nextDouble();
        return userNum;
    }

}
