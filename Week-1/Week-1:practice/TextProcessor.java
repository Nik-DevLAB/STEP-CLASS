//Creating a text processor adding all the features from previous exercises
import java.util.*;

public class TextProcessor {

    public static String cleanInput(String input) {
        input = input.trim().replaceAll("\\s+", " ");
        String[] words = input.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void analyzeText(String text) {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        int sentenceCount = text.split("[.!?]").length;
        int charCount = text.replace(" ", "").length();

        String longestWord = "";
        for (String word : words) {
            String clean = word.replaceAll("[^a-zA-Z]", "");
            if (clean.length() > longestWord.length()) {
                longestWord = clean;
            }
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.replaceAll("\\s+", "").toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        char mostCommonChar = ' ';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                mostCommonChar = e.getKey();
            }
        }

        System.out.println("\n--- TEXT ANALYSIS ---");
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters (no spaces): " + charCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Most Common Character: '" + mostCommonChar + "' (" + maxFreq + " times)");
    }

    public static String[] getWordsSorted(String text) {
        String[] words = text.replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== TEXT PROCESSOR ===");
        System.out.print("Enter a paragraph: ");
        String paragraph = scanner.nextLine();

        String cleaned = cleanInput(paragraph);
        System.out.println("\nCleaned Text: " + cleaned);

        analyzeText(cleaned);

        System.out.println("\n--- SORTED WORDS ---");
        String[] sortedWords = getWordsSorted(cleaned);
        for (String w : sortedWords) {
            System.out.println(w);
        }

        System.out.print("\nEnter a word to search: ");
        String search = scanner.nextLine();
        boolean found = Arrays.stream(sortedWords).anyMatch(w -> w.equalsIgnoreCase(search));
        System.out.println(found ? "Word found!" : "Word not found!");

        scanner.close();
    }
}
