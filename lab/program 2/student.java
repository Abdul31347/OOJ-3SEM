import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    String usn;
    String name;
    int[] credit;
    int[] marks;

    public Student(int numSubjects) {
        credit = new int[numSubjects];
        marks = new int[numSubjects];
    }

    void accept() {
        System.out.println("Enter USN:");
        usn = sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        for (int i = 0; i < credit.length; i++) {
            System.out.printf("Enter credit of subject %d: ", i + 1);
            credit[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Enter marks of subject %d: ", i + 1);
            marks[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < credit.length; i++) {
            System.out.printf("Credit of subject %d: %d%n", i + 1, credit[i]);
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Marks of subject %d: %d%n", i + 1, marks[i]);
        }
    }

    void calc() {
        int totalCredits = 0;
        int weightedMarks = 0;
        for (int i = 0; i < credit.length; i++) {
            int gradePoints = (marks[i] / 10) + 1; // Simplified grading system
            totalCredits += credit[i];
            weightedMarks += gradePoints * credit[i];
        }
        if (totalCredits == 0) {
            System.out.println("GPA: 0.0 (No credits available)");
        } else {
            double gpa = (double) weightedMarks / totalCredits;
            System.out.printf("GPA: %.2f%n", gpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int numSubjects = sc.nextInt();
        Student s1 = new Student(numSubjects);
        s1.accept();
        s1.display();
        s1.calc();
        sc.close();
    }
}
