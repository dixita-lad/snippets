import java.util.ArrayList;

public class FindIndexOfNumber {
    //given 2 ints A and B, find the index of A in B
    //i.e.  A= 23 and B= 5632369 will return 3
    //A= 23 and B= 563236923 will return 3 and 7
    public static void main(String[] args) {
        int A= 23;
        int B= 563236923;

        String stringA= Integer.toString(A);
        String stringB= Integer.toString(B);

        ArrayList<Integer> list = new ArrayList<>();

        int newIndex= 0;

        while (stringB.indexOf(stringA, newIndex) != -1) {
            list.add(stringB.indexOf(stringA, newIndex));
            newIndex = stringB.indexOf(stringA, newIndex) +1;
        }

        list.forEach(x -> System.out.println(x));
    }
}
