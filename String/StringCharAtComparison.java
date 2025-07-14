import java.util.Scanner;

public class StringCharAtComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // Different lengths => strings are not equal
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; // Mismatched character found
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for two strings
        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        // Comparing using charAt() method
        boolean areEqual = compareUsingCharAt(str1, str2);

        // Printing result
        if (areEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        input.close();
    }
}
