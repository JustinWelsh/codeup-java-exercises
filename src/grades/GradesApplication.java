package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<String, Student>();
        Student justin = new Student("Justin");
        justin.addGrade(85);
        justin.addGrade(75);
        justin.addGrade(88);
        students.put("J-dub", justin);

        Student mike = new Student("Mike");
        mike.addGrade(85);
        mike.addGrade(68);
        mike.addGrade(98);
        students.put("magic-mike", mike);

        Student marty = new Student("Marty");
        marty.addGrade(75);
        marty.addGrade(77);
        marty.addGrade(80);
        students.put("marty-moose", marty);

        Student jason = new Student("Jason");
        jason.addGrade(95);
        jason.addGrade(65);
        jason.addGrade(82);
        students.put("J-sin", jason);


        System.out.println("\nWelcome!");
        while (true) {
        System.out.println("\nHere are the GitHub usernames of our students:\n");
        students.forEach((key, value) -> System.out.printf("|%s| ", key));

            System.out.println("\nWhat student would you like to see more information on?\n");
            String userinput = sc.nextLine();

            if (!students.containsKey(userinput)) {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", userinput);
            } else {
                System.out.printf("Name: %s - GitHub Username: %s\nCurrent grade average: %.2f\n",
                        students.get(userinput).getName() ,userinput, students.get(userinput).getGradeAverage());
            }

            System.out.println("\nWould you like to see another student?\n");
            System.out.println("Enter [y] or [n]");
            String userContinue = sc.next();

            while (!userContinue.equalsIgnoreCase("y") && !userContinue.equalsIgnoreCase("n")) {
                System.out.println("Enter [y] or [n]");
                userContinue = sc.next();
            }
            if (userContinue.equalsIgnoreCase("n")) {
                System.out.println("Goodbye, and have a wonderful day!\n");
                break;
            }
            if (userContinue.equalsIgnoreCase("y")) {
                continue;
            }

        };

    }
}
