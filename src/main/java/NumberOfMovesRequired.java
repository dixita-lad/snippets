import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//for array of int, return nuber of moves that need to be made to arange the list so all even numbers are in beginning and all odd are at the end
public class NumberOfMovesRequired {
    public static void main(String[] args) {
        int[] array= {2, 5, 4, 8, 9, 7, 5, 10, 6};
        int numOfMoves= numberOfMoves(array);

        System.out.println(numOfMoves);

    }

    public static int numberOfMoves(int[] numberList) {
        HashMap<String, List<Integer>> map= new HashMap<>();
        ArrayList<Integer> oddNumberIndex= new ArrayList<>();
        ArrayList<Integer> evenNumberIndex= new ArrayList<>();

        for(int i=0; i < numberList.length; i++) {
            if(numberList[i]%2==0) {
                evenNumberIndex.add(i);
                map.put("even", evenNumberIndex);
            }
            else {
                oddNumberIndex.add(i);
                map.put("odd", oddNumberIndex);
            }
        }

        int numberOfEven = map.get("even").size();
        int move=0;

        for(int i: map.get("even")) {
            if(i >= numberOfEven) {
                move++;
            }
        }
        return move;
    }
}
