import java.util.Scanner;

public class ArrayIndexDemo {

    // Method to generate ArrayIndexOutOfBoundsException without handling
    public static void generateException(String[] names) {
        System.out.println("\nGenerating exception (without handling)...");
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println("Accessing element at index 10: " + names[10]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        System.out.println("\nHandling exception with try-catch block...");
        try {
            // This will also throw ArrayIndexOutOfBoundsException
            System.out.println("Accessing element at index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define array to store names
        String[] names = new String[5];

        // Take input from user
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        // Call method to generate unhandled exception (this will terminate program if not commented)
        // generateException(names); // Uncomment this to see the abrupt stop

        // Call method to handle the exception properly
        handleException(names);
    }
}
