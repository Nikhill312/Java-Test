import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String str = "Hello world, this is a test string";
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Count the number of occurrences of each word
        for (String word : words) {
            word = word.toLowerCase(); // Convert word to lowercase for case-insensitive counting
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Display the word count
        System.out.println("Word count:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
