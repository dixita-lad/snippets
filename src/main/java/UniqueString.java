import java.util.HashSet;

public class UniqueString {
    //check if the string contains an duplicate characters
    public static void main(String[] args) {
        String str= "abcdefghijklmna";
        boolean isUnique = isUniqueChars_2(str);
        System.out.println("Strung " + str + " is unique: " +  isUnique);
    }

    private static boolean isUniqueChars(String str) {
        if(str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for(int i=0; i < str.length(); i++) {
            int var = str.charAt(i);
            if(char_set[var]) {
                return false;
            }
            char_set[var] = true;
        }
        return true;
    }

    private static boolean isUniqueChars_2(String str) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i < str.length(); i++) {
            if(!set.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
