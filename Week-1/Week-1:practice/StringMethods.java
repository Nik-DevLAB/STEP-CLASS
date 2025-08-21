import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter your full name (first and last): ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your favorite programming language: ");
        String favLang = scanner.nextLine();

        System.out.print("Enter a sentence about your programming experience: ");
        String sentence = scanner.nextLine();

        // Processing
        String[] nameParts = fullName.trim().split("\\s+");
        String firstName = nameParts[0];
        String lastName = (nameParts.length > 1) ? nameParts[1] : "";

        int charCount = sentence.replace(" ", "").length();
        String favLangUpper = favLang.toUpperCase();

        // Output
        System.out.println("\n--- SUMMARY ---");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Favorite Language: " + favLangUpper);
        System.out.println("Sentence Character Count (no spaces): " + charCount);

        scanner.close();
    }
}
