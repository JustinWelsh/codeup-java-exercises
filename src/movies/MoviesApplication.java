package movies;

import util.Input;

public class MoviesApplication {

    public static void movieApp() {
        Movie[] movieArray = MoviesArray.findAll();
        boolean runProgram = true;
        Input sc = new Input();

        while (runProgram) {
            System.out.println("\nWhat would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "\n" +
                    "Enter your choice:");
            int userNum = sc.getInt(0,5);
            if (userNum == 0) {
                System.out.println("\nSee ya later..");
                System.out.println("Be kind, rewind..");
                System.out.println("THE END");
                runProgram = false;
            } else if (userNum == 1) {
                for (Movie movie : movieArray) {
                    System.out.printf("%s --- (%s)\n", movie.getName(), movie.getCategory());
                }
            } else if (userNum == 2) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.printf("%s --- (%s)\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userNum == 3) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.printf("%s --- (%s)\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userNum == 4) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.printf("%s --- (%s)\n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (userNum == 5) {
                for (Movie movie : movieArray) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.printf("%s --- (%s)\n", movie.getName(), movie.getCategory());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        movieApp();
    }
}
