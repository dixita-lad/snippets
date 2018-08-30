import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String firstWord = "mary";
        String secondWord = "raym";

        char[] firstWordInArray = firstWord.toCharArray();
        char[] secondWordInArray = secondWord.toCharArray();

        Arrays.sort(firstWordInArray);
        Arrays.sort(secondWordInArray);

        if(Arrays.equals(firstWordInArray, secondWordInArray)) {
            System.out.println("arrays are same");
        }
    }
}
