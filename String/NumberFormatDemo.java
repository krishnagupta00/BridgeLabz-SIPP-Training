import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException without handling
    public static void generateException(String text) {
        System.out.println("\nGenerating exception (without handling)...");
        // This will throw NumberFormatException if input is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        System.out.println("\nHandling exception with try-catch block...");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take string input from the user
        System.out.print("Enter a string to convert to a number: ");
        String userInput = input.nextLine();
	// Call method to handle the exception safely
        handleException(userInput);
    }
}
