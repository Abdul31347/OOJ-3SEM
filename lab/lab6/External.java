package SEE;

import CIE.Internals;
import java.util.Scanner;

public class External extends Internals {

    protected int[] externalMarks = new int[5];
    protected int[] finalMarks = new int[5];
    Scanner input = new Scanner(System.in);

    public External(String USN, String Name, int Sem) {
        super(USN, Name, Sem);
    }

    public void setMarksSEE() {
        System.out.println("Enter the external marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            externalMarks[i] = input.nextInt();
        }
    }

    public void calcFinalMarks() {
        System.out.println("Final Marks:");
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = marks[i] + externalMarks[i];
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]);
        }
    }
}
