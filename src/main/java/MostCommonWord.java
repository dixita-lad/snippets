import java.util.Arrays;
import java.util.HashMap;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph= "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] charsToRemove = {",", "."};

        for(String c: charsToRemove) {
            paragraph= paragraph.replaceAll(c, "");
        }

        String[] words= paragraph.toLowerCase().split(" ");
        Arrays.sort(words);

        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            if(wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            else {
                wordCount.put(word, 1);
            }
        }

        System.out.println(wordCount.toString());

    }
}
