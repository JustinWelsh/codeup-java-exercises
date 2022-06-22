package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

//CONSTRUCTOR
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade) {
         grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double bucket = 0;
        for (int i = 0; i < grades.size(); i++) {
            bucket += grades.get(i);
        }
        return bucket / grades.size();
    }
}
