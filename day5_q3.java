
// 3. Write a Java program to create a super class Vehicle having members,
// company name and price. Derive two different classes LightMotorVehicle (members – mileage)
// and HeavyMotorVehicle (members – capacity-in-tons). Accept the information
// for n vehicles and display the information in appropriate form. While taking data,
// ask the user about the type of vehicle first. Each vehicle should have a unique number
// starting from 100001. This number should be generated at the time of instantiation.
import java.util.Scanner;

class Vehicle {
    String name;
    double price;
    int regno;
    static int count = 100001;

    Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
        this.regno = count++; // important
    }

    void display() {
        System.out.println("Reg No: " + regno + ", Name: " + name + ", Price: " + price);
    }

}

class LightMotorVehicle extends Vehicle {
    double mileage;

    LightMotorVehicle(String name, double price, double mileage) {
        super(name, price);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }

}

class HeavyMotorVehicle extends Vehicle {
    int capacity;

    HeavyMotorVehicle(String name, double price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    void display() {
        super.display();
        System.out.println("Capacity: " + capacity + " tons");
    }
}

class day5_q3 {
    public static void main(String[] args) {
        String name;
        double price;
        int capacity;
        double mileage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of vehicle :");
        int n = sc.nextInt();
        Vehicle[] v = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter vehicle " + (i + 1) + " type (1 for Heavy, 2 for Light):");
            int ch = sc.nextInt();
            sc.nextLine(); // clear buffer before reading string
        
            System.out.println("Enter name:");
            name = sc.nextLine();
            
            System.out.println("Enter price:");
            price = sc.nextDouble();
        
            if (ch == 1) {
                System.out.println("Enter capacity (tons):");
                capacity = sc.nextInt();
                v[i] = new HeavyMotorVehicle(name, price, capacity);
            } else {
                System.out.println("Enter mileage (km/l):");
                mileage = sc.nextDouble();
                v[i] = new LightMotorVehicle(name, price, mileage);
            }
        }
        for (int i = 0; i < n; i++){
            v[i].display();
        }

    }
}