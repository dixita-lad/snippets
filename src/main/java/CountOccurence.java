import java.util.HashMap;
import java.util.Map;

public class CountOccurence {
    public static void main(String[] args) {
        int[] listOfNumbers= {1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9};
        Map<Integer, Integer> count = new HashMap<>();

        for(int i: listOfNumbers) {
            if(count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            }
            else {
                count.put(i, 1);
            }
        }

        count.forEach((k,v) -> System.out.println(k + " is listed " + v + " times"));
    }
}
