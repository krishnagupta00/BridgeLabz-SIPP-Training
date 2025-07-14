import java.util.*;

public class Youngest_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        int amarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();
        int akbarAge = sc.nextInt();

        // Input heights
        double amarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();

        // Finding the youngest
        if (amarAge < anthonyAge && amarAge < akbarAge) {
            System.out.println("Amar is the youngest one");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest one");
        } else {
            System.out.println("Anthony is the youngest one");
        }

        // Finding the tallest
        if (amarHeight > anthonyHeight && amarHeight > akbarHeight) {
            System.out.println("Amar is the tallest one");
        } else if (akbarHeight > anthonyHeight && akbarHeight > amarHeight) {
            System.out.println("Akbar is the tallest one");
        } else {
            System.out.println("Anthony is the tallest one");
        }

        sc.close(); // Always good to close Scanner
    }
}
