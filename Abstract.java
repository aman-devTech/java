
// Design an abstract class Shape having 2 methods calculateArea() and display().
// Create Rectangle and Triangle classes by inheriting the Shape class and override
// above methods to suitably implement for Rectangle and Triangle class.
import java.util.Scanner;

abstract class Shape {
    double area;

    // method 1
    abstract void calculateArea();

    // m2
    abstract void display();
}

class Rectangle extends Shape {
    double lenght, breadth;

    Rectangle(double lenght, double breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    void calculateArea() {
        area = lenght * breadth;
    }

    void display() {
        System.out.println("the area of rectangle is " + area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }

    void display() {
        System.out.println("the area of triangle is " + area);
    }
}

class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input & execution
        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle r = new Rectangle(length, breadth);
        r.calculateArea();
        r.display();

        System.out.println();

        // --- Triangle Execution ---
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();
        Triangle t = new Triangle(base, height);
        t.calculateArea();
        t.display();

    }

}