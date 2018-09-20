public class BubbleSort {
    public static void main(String[] args) {
        int[] listOfNumbers= {3, 6, 8, 1, 2, 9, 4, 5, 10, 7};
        int[] listOfNumbers2= {3, 6, 8, 1, 2, 9, 4, 5, 10, 7};

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
            System.out.print(i + " ");
        }

        System.out.print("\n");

        for(int i=0; i < listOfNumbers2.length; i++) {
            for(int j=i+1; j< listOfNumbers2.length; j++) {
                if(listOfNumbers2[i] > listOfNumbers2[j]) {
                    int temp= listOfNumbers2[i];
                    listOfNumbers2[i] = listOfNumbers2[j];
                    listOfNumbers2[j] = temp;
                }
            }
        }

        for(int i: listOfNumbers2) {
            System.out.print(i + " ");
        }
    }
}
