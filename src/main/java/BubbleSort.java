public class BubbleSort {
    public static void main(String[] args) {
        int[] listOfNumbers= {3, 6, 8, 1, 2, 9, 4, 5, 10, 7};

        for (int i=0; i < listOfNumbers.length; i++) {
            for(int j=0; j<listOfNumbers.length-1; j++) {
                if(listOfNumbers[j]>listOfNumbers[j+1]) {
                    int temp = listOfNumbers[j+1];
                    listOfNumbers[j+1]=listOfNumbers[j];
                    listOfNumbers[j]= temp;
                }
            }
        }

        for(int i: listOfNumbers) {
            System.out.println(i);
        }
    }
}
