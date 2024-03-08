import java.util.*;

public class test {
    public String sortSentence(String s) {
        // Split the input string into words
        String[] words = s.split(" ");
        
        // Create a map to store each word with its corresponding number
        Map<Integer, String> map = new HashMap<>();
        
        // Iterate over each word
        for (String word : words) {
            // Extract the number from the end of the word
            int number = Character.getNumericValue(word.charAt(word.length() - 1));
            // Extract the word without the number
            String wordWithoutNumber = word.substring(0, word.length() - 1);
            // Store the word and its number in the map
            map.put(number, wordWithoutNumber);
        }
        
        // Sort the map based on the numbers
        List<String> sortedWords = new ArrayList<>();
        for (int i = 1; i <= words.length; i++) {
            sortedWords.add(map.get(i));
        }
        
        // Join the sorted words into a single string
        return String.join(" ", sortedWords);
    }

    public static void main(String[] args) {
        test solution = new test();
        String result = solution.sortSentence("is2 sentence4 This1 a3");
        System.out.println(result); // Output: "This is a sentence"
    }
}
