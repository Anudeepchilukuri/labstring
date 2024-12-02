import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        // Read the input string
        String userInput = scanner.nextLine();

        // Reverse the string
        String reversedString = reverse(userInput);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner to prevent memory leak
        scanner.close();
    }

    // Method to reverse the string
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

