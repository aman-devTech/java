import java.util.Scanner;

public class Time {
    int hour, minute, second;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (0-23): ");
        hour = sc.nextInt();
        System.out.print("Enter minute (0-59): ");
        minute = sc.nextInt();
        System.out.print("Enter second (0-59): ");
        second = sc.nextInt();
    }

    void display() {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            System.out.println("Invalid time input!");
            return;
        }

        String period;
        int displayHour;

        if (hour == 0) {
            displayHour = 12;
            period = "AM";
        } else if (hour == 12) {
            displayHour = 12;
            period = "PM";
        } else if (hour > 12) {
            displayHour = hour - 12;
            period = "PM";
        } else {
            displayHour = hour;
            period = "AM";
        }

        System.out.printf("Time in AM/PM format: %02d:%02d:%02d %s\n", displayHour, minute, second, period);
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.input();
        t.display();
    }
}