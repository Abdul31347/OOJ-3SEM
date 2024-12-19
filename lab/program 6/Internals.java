package CIE;

import java.util.Scanner;

public class Internals extends Student {

    public int[] marks = new int[5];
    Scanner input = new Scanner(System.in);

    public Internals(String USN, String Name, int Sem) {
        super(USN, Name, Sem);
    }

    public void setMarks() {
        System.out.println("Enter the internal marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = input.nextInt();
        }
    }

    public void displayMarks() {
        System.out.print("Internal Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
