import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] listOfNumbers= {1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicates= new ArrayList<>();

        for(int n: listOfNumbers) {
            if(!set.add(n)) {
                duplicates.add(n);
            }
        }
        for(int n: duplicates) {
            System.out.println("found duplicate element: " + n);
        }

        set.forEach(x -> System.out.print(x));
        System.out.println();
        duplicates.forEach(x -> System.out.print(x));
    }
}
