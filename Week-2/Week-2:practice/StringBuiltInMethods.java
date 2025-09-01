// PRACTICE PROBLEM 1: (Any 4)
// Built-In String Methods - Basic Operations
// Task: Create a program that demonstrates common String methods for text analysis and
// manipulation.


// TODO: Use built-in methods to perform the following operations:
// 1. Display original string length including spaces
// 2. Remove leading and trailing spaces, show new length
// 3. Find and display the character at index 5
// 4. Extract substring "Programming" from the text
// 5. Find the index of the word "Fun"
// 6. Check if the string contains "Java" (case-sensitive)
// 7. Check if the string starts with "Java" (after trimming)
// 8. Check if the string ends with an exclamation mark
// 9. Convert the entire string to uppercase
// 10. Convert the entire string to lowercase
// TODO: Create a method that counts vowels using charAt()
// TODO: Create a method that finds all occurrences of a character
// TODO: Display all results in a formatted manner

import java.util.*;

public class StringBuiltInMethods {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // 1. Display original string length including spaces
        System.out.println("Original string length (including spaces): " + str.length());

        // 2. Remove leading and trailing spaces, show new length
        String trimmedStr = str.strip();
        System.out.println("Trimmed string length: " + trimmedStr.length());

        // 3. Find and display the character at index 5
        if (str.length() > 5) {
            System.out.println("Character at index 5: " + str.charAt(5));
        } else {
            System.out.println("String is too short to find character at index 5.");
        }

        // 4. Extract substring "Programming" from the text
        if (str.contains("Programming")) {
            int startIndex = str.indexOf("Programming");
            int endIndex = startIndex + "Programming".length();
            System.out.println("Extracted substring: " + str.substring(startIndex, endIndex));
        } else {
            System.out.println("The word 'Programming' is not found in the string.");
        }
    }
}