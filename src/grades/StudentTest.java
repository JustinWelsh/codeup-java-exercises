package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student Justin = new Student("Justin", new ArrayList<>());
        Justin.addGrade(92);
        System.out.println(Justin.getGradeAverage());


    }
}
