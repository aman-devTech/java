import java.util.Scanner;

interface ElectricityBill {
    double calculateBill(int units);
}

class DomesticConnection implements ElectricityBill {

    public double calculateBill(int units) {

        double bill = 0;

        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        }
        else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        return bill;
    }
}

class CommercialConnection implements ElectricityBill {

    public double calculateBill(int units) {

        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        }
        else if (units <= 200) {
            bill = (100 * 5) + (units - 100) * 7;
        }
        else {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }

        return bill;
    }
}

public class day5_q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        System.out.print("Enter connection type (1-Domestic, 2-Commercial): ");
        int type = sc.nextInt();

        ElectricityBill bill;

        if (type == 1) {
            bill = new DomesticConnection();
        }
        else {
            bill = new CommercialConnection();
        }

        System.out.println("Total Bill: " + bill.calculateBill(units));

        
    }
}