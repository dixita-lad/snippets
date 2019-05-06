import java.util.Arrays;

public class LowestMissingNumber {
    //given array of numbers find the lowest missing number
    //i.e. in array(1,5,4,2,6), lowest missing number is 3
    //lowest number is 0  i.e. in array (-3, -4, -6), lowest missing number is 1
    //in array (1, 2, 3, 4), lowest missing number is 5
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 4, 2, 6, 7, 9};
        int num= FindLowestNumber(numbers);
        System.out.println(num);
    }

    public static int FindLowestNumber(int[] numbers) {
        Arrays.sort(numbers);

        for(int i=1; i < numbers.length; i++) {
            if(numbers[i]!=(numbers[i-1] +1)) {
                return numbers[i] -1;
            }
        }
        return 1;
    }
}
