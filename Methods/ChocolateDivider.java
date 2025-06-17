import java.util.Scanner;

public class ChocolateDivider {

    // Method to return quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // Quotient: chocolates per child
        result[1] = number % divisor; // Remainder: chocolates left
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Edge case check
        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than 0.");
            return;
        }

        // Calculate and display
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child will get " + result[0] + " chocolate(s).");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
