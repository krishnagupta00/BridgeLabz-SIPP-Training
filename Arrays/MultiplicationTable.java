import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Create an array to store the results
        int[] table = new int[10];

        // Step 3: Compute and store the multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Step 4: Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
