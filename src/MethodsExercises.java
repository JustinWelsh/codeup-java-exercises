import java.util.Scanner;

public class MethodsExercises {
//TODO #1
    public static int add(int num1, int num2 ){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2 ){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2 ){
        return num1 * num2;
    }
    public static double divide(double num1, double num2 ){
        return num1 / num2;
    }
    public static int remainder(int num1, int num2 ){
        return num1 % num2;
    }

//-------------------------------------------------------------
//TODO #2

public static int getInteger(int min, int max) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nEnter a number between 1 and 10: ");
    int userNum = scan.nextInt();
    if (userNum >= min && userNum <= max) {
        return userNum;
    }
    System.out.println("Invalid number");
        return getInteger(min, max);
}

//TODO #3

    public static void getFactorial() {
        Scanner scan = new Scanner(System.in);
        int userNum = getInteger(1,10);

        long userFactorial = 1;
        for (int i = 1; i <= userNum; i++) {
            userFactorial *= i;
            System.out.println(userFactorial);
        }
    }

//TODO Dice Game

    public static void diceRoll() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int numberOfSides = scan.nextInt();
        int firstDie = (int)(Math.random() * numberOfSides) + 1;
        int secondDie = (int)(Math.random() * numberOfSides) + 1;

    }


    //-------------------------------------------------------------
    public static void main (String[] args) {

//TODO #1 (main)

//        System.out.println(add(5,6));
//        System.out.println(subtract(30,6));
//        System.out.println(multiply(5,6));
//        System.out.println(divide(37,6));
//        System.out.println(remainder(7,6));


//TODO #2 (main)

//        System.out.println(getInteger(1,10));

//TODO #3 (main)

//        getFactorial();

//TODO Dice Game (main)

        diceRoll();

    }
}
