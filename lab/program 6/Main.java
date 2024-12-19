import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        External[] students = new External[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("USN: ");
            String usn = scanner.nextLine();

            System.out.print("Semester: ");
            int sem = scanner.nextInt();

            students[i] = new External(usn, name, sem);

            students[i].setMarks();
            students[i].setMarksSEE();

            scanner.nextLine(); // Clear the newline
        }

        System.out.println("\nStudent Details and Final Marks:");
        for (External student : students) {
            student.displayDetails();
            student.displayMarks();
            student.calcFinalMarks();
        }

        scanner.close();
    }
}
