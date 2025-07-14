import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Create array, total and index
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Step 2: Infinite loop for input
        while (true) {
            double value = input.nextDouble();

            // Step 3: Break if 0 or negative
            if (value <= 0) {
                break;
            }

            // Step 4: Break if index reaches 10
            if (index == 10) {
                break;
            }

            // Step 5: Store value and increment index
            numbers[index] = value;
            index++;
        }

        // Step 6: Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Step 7: Display entered values
        System.out.println("Entered values:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display sum
        System.out.println("\nSum = " + total);

        input.close();
    }
}
