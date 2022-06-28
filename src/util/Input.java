package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
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

        int userNum;
        try {
             userNum = Integer.valueOf(getString());
            if (userNum >= min && userNum <= max) {
                return userNum;
            }
            return getInt(min, max);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
            return getInt(min, max);
        }
    }

     public int getInt() {
         System.out.println("Enter a number\n");
         int userNum;
        try {
         userNum = Integer.valueOf(getString());
         return userNum;
        } catch (NumberFormatException e) {
//            System.out.println("Wrong input");
            e.printStackTrace();
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a large decimal number between %f - %f\n", min, max);
        double userNum;
        try {
            userNum = Double.valueOf(getString());
            if (userNum >= min && userNum <= max) {
                return userNum;
            }
            return getDouble(min, max);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input");
            e.printStackTrace();
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.printf("Enter a decimal number before I turn green. .\n");
        double userNum;
        try {
            userNum = Double.valueOf(getString());
            return userNum;
        } catch (NumberFormatException e) {
//            System.out.println("Wrong input");
            e.printStackTrace();
            return getInt();
        }
    }

}
