import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Step 1: Create Scanner object
      
        //System.out.print("Enter a number: ");
        System.out.print("Enter a number:");
        int number = input.nextInt(); // Step 2: Take user input

        // Step 3: Apply if-else conditions
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close(); // Step 4: Close the Scanner to avoid memory leaks
    }
}

