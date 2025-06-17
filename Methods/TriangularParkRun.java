import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds needed to complete 5 km (5000 meters)
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);  // Rounds must be whole, use ceiling
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: lengths of the three sides
        System.out.print("Enter side A (in meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side B (in meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side C (in meters): ");
        double c = sc.nextDouble();

       
        // Calculate and display number of rounds
        int rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + rounds + " round(s) to finish 5 km.");
    }
}
