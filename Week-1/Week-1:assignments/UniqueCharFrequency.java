import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find unique characters in a string
    public static char[] findUniqueChars(String text) {
        char[] unique = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount++] = ch;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }

    // Method to find frequency of characters
    public static int getFrequency(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) count++;
        }
        return count;
    }

    // Method to create a 2D array with unique chars and their frequency
    public static String[][] uniqueCharFrequencyTable(String text) {
        char[] uniques = findUniqueChars(text);
        String[][] table = new String[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            table[i][0] = String.valueOf(uniques[i]);
            table[i][1] = String.valueOf(getFrequency(text, uniques[i]));
        }
        return table;
    }

    // Method to display the table
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = uniqueCharFrequencyTable(text);
        displayTable(table);

        sc.close();
    }
}
