package CIE;

public class Student {

    public String USN;
    public String Name;
    public int Sem;

    public Student(String USN, String Name, int Sem) {
        this.USN = USN;
        this.Name = Name;
        this.Sem = Sem;
    }

    public void displayDetails() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + Name);
        System.out.println("Semester: " + Sem);
    }
}
