import java.util.Scanner;

public class lab1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                System.out.println("The equation has no real solutions.");
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The equation has one real solution: " + root);
            } else {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two real solutions:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            }
        
        
    }
}
