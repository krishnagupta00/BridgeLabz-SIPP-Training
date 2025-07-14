import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Initialize maxFactor, array and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step 3: Find factors and store in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Step 4: Resize array if index reaches maxFactor
                if (index == maxFactor) {
                    maxFactor *= 2; // double the size
                    int[] temp = new int[maxFactor];

                    // Copy old elements to temp
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Point factors to new larger array
                    factors = temp;
                }

                // Store the factor
                factors[index] = i;
                index++;
            }
        }

        // Step 5: Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
