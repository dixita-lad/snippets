import java.util.Arrays;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] listOfNumbers= {4, 6, 8, 7, 11, 3, 2, 9, 10, 5};

        int maxNumber= Arrays.stream(listOfNumbers).max().getAsInt();
        int minNumber= Arrays.stream(listOfNumbers).min().getAsInt();

        System.out.println("max number: " + maxNumber);
        System.out.println("min number: " + minNumber);
    }
}
