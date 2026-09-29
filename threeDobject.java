
import java.util.Scanner;

class threeDobjects {

    void area() {
    }

    void volume() {
    }
}

class Box extends threeDobjects {

    int l, b, h;

    Box(int length, int breadth, int height) {
        this.l = length;
        this.b = breadth;
        this.h = height;
    }

    void area() {
        int area = 2 * (l * b + b * h + h * l);
        System.out.println("Box area = " + area);
    }

    void volume() {
        int volume = l * b * h;
        System.out.println("Box volume = " + volume);
    }
}

class Cube extends threeDobjects {

    int side;

    Cube(int side) {
        this.side = side;
    }

    void area() {
        int area = 6 * side * side;
        System.out.println("Cube area = " + area);
    }

    void volume() {
        int volume = side * side * side;
        System.out.println("Cube volume = " + volume);
    }
}

class Cylinder extends threeDobjects {

    double r, h;

    Cylinder(double radius, double height) {
        this.r = radius;
        this.h = height;
    }

    void area() {
        double area = 2 * Math.PI * r * (r + h);
        System.out.println("Cylinder area = " + area);
    }

    void volume() {
        double volume = Math.PI * r * r * h;
        System.out.println("Cylinder volume = " + volume);
    }
}

class Cone extends threeDobjects {

    double r, h;

    Cone(double radius, double height) {
        this.r = radius;
        this.h = height;
    }

    void area() {
        double slantHeight = Math.sqrt(r * r + h * h);
        double area = Math.PI * r * (r + slantHeight);
        System.out.println("Cone area = " + area);
    }

    void volume() {
        double volume = (Math.PI * r * r * h) / 3;
        System.out.println("Cone volume = " + volume);
    }
}

class threeDobject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Box length: ");
        int l = sc.nextInt();

        System.out.print("Enter Box breadth: ");
        int b = sc.nextInt();

        System.out.print("Enter Box height: ");
        int h = sc.nextInt();

        Box box = new Box(l, b, h);
        box.area();
        box.volume();

        System.out.print("\nEnter Cube side: ");
        int side = sc.nextInt();

        Cube cube = new Cube(side);
        cube.area();
        cube.volume();

        System.out.print("\nEnter Cylinder radius: ");
        double cylinderRadius = sc.nextDouble();

        System.out.print("Enter Cylinder height: ");
        double cylinderHeight = sc.nextDouble();

        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        cylinder.area();
        cylinder.volume();

        System.out.print("\nEnter Cone radius: ");
        double coneRadius = sc.nextDouble();

        System.out.print("Enter Cone height: ");
        double coneHeight = sc.nextDouble();

        Cone cone = new Cone(coneRadius, coneHeight);
        cone.area();
        cone.volume();
    }
}

