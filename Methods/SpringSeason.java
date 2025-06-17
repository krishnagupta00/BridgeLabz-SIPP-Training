import java.util.Scanner;

public class SpringSeason {

    // Method to check if the date is in Spring Season
    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) ||
               (month == 4) ||
               (month == 5) ||
               (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for month and day
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        // Check and print result
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
