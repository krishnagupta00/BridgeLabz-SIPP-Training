import java.util.Scanner;

public class StringExceptionDemo {

    
    public static void generateException(String text) {
        System.out.println("\nGenerating exception (without handling)...");
        // Accessing index beyond length will throw runtime exception
        System.out.println("Character at index 100: " + text.charAt(100));
    }
	 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                System.out.print("Enter a string: ");
        String userInput = input.nextLine();
	 generateException(userInput); 
         handleException(userInput);

        input.close();
    }
}
