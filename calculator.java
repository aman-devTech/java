import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nmenu : ");
            System.out.println("1. add ");
            System.out.println("2. subtract ");
            System.out.println("3. multiply ");
            System.out.println("4. divide ");
            System.out.println("5. exit ");
            System.out.println("choose any one");
            choice = sc.nextInt();

            // Only prompt for numbers if the user chooses a math operation (1-4)
            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter the first number");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number");
                int num2 = sc.nextInt();

                int res;
                switch (choice) {
                    case 1:
                        res = num1 + num2;
                        System.out.println("Result: " + res);
                        break;
                    case 2:
                        res = num1 - num2;
                        System.out.println("Result: " + res);
                        break;
                    case 3:
                        res = num1 * num2;
                        System.out.println("Result: " + res);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                        } else {
                            double divideRes = (double) num1 / num2;
                            System.out.println("Result: " + divideRes);
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("exiting....");
            } else {
                System.out.println("invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}