import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] listOfNumbers= {3, 6, 8, 1, 2, 9, 4, 5, 10, 7};
        Arrays.sort(listOfNumbers);
        for(int n: listOfNumbers) {
            System.out.println(n);
        }
    }
}
