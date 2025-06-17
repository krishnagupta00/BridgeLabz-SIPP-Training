import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate sum of n natural numbers using a loop
    public static int calculateSum(int n) {
        int sum = 0;
	for (int i = 1; i <= n; i++) {
            sum += i;
        }return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // Get input from the user
        System.out.print("Enter a positive number (n): ");
        int n = input.nextInt();
 	// Validate input
        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }
        // Calculate and display the sum
        int sum = calculateSum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
