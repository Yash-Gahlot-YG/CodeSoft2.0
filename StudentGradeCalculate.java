import java.util.*;

class GradeCalculate {
    double average;
    double totalMarks;
    int numSubjects;
    String[] subjectNames;
    double[] studentGrades;

    Scanner sc = new Scanner(System.in);

    public void inputMarks() {
        System.out.println("STUDENT GRADE CALCULATOR" );
        System.out.println("Enter the number of subjects:");
        numSubjects = sc.nextInt();
        subjectNames = new String[numSubjects];
        studentGrades = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = sc.next();
        }

        for (int j = 0; j < numSubjects; j++) {
            System.out.print("Enter the Marks for " + subjectNames[j] + ": ");
            studentGrades[j] = sc.nextDouble();
        }

        totalMarks = 0.0;
        for (double grade : studentGrades) {
            totalMarks += grade;
        }

        average = totalMarks / numSubjects; // Calculate the average

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average);
    }

    public void calculatorDivison() {
        if (average >= 90) {
            System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
            System.out.println(average);
        }
    }
}

public class StudentGradeCalculate {
    public static void main(String[] args) {
        GradeCalculate gc = new GradeCalculate();
        gc.inputMarks();
        gc.calculatorDivison();
    }
}
