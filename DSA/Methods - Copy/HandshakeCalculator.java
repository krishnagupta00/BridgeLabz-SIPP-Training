import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are needed for a handshake.");
        } else {
            int handshakes = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of handshakes is: " + handshakes);
        }
    }
}
