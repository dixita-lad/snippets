import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] listOfNumbers= {1, 2, 3, 4, 5, 7, 8, 9, 10};

        int n= 10;
        int expectedSum= n * (n+1) /2;
        int actualSum= Arrays.stream(listOfNumbers).sum();

        int missingNumber= expectedSum - actualSum;

        System.out.println("missing number is: " +  missingNumber);
    }

}
