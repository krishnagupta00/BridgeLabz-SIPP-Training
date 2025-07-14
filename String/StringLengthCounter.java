import java.util.Scanner;

public class StringLengthCounter {

    // Method to count characters 
        public static int getLength(String str) {
        char[] chars = str.toCharArray();  // Convert to character array
        int count = 0;

        for (char c : chars) {
            count++;  // Count each character
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();  // Read full sentence

        int Length = getLength(text);
	System.out.println("Length without using length(): " + Length);
        input.close();
    }
}
