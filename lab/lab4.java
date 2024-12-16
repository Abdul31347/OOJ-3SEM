import java.util.Scanner;

abstract class Shape {
    int l,b,r;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        this.l = length;
        this.b = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + l* b);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        this.l = base;
        this.b = height;
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * l * b));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        this.r = radius;
    }
    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * l * l));
    }
}

public class area{
    public static void main(String[] args) {
	Rectangle r1=new Rectangle(10,20);
	r1.printArea();
	Triangle t1=new Triangle(10,20);
	t1.printArea();
	Circle c1=new Circle(20);
	c1.printArea();
    }
}
