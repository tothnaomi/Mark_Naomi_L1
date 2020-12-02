public class myArray {

    /**
     * @param inputArray is an array with numbers
     * @return the maximum element from the given array
     */
    public static int findMaximum (int[] inputArray) {

        int maximum = inputArray[0];
        for(int elem: inputArray) {
            if (elem>maximum) maximum = elem;
        }
        return maximum;
    }

    /**
     *
     * @param inputArray is an array with numbers
     * @return the minimum element from the given array
     */
    public static int findMinimum (int[] inputArray) {

        int minimum = inputArray[0];
        for(int elem: inputArray) {
            if (elem<minimum) minimum = elem;
        }
        return minimum;
    }

    /**
     * @param inputArray is an array with numbers
     * @return maximum sum of n-1 numbers
     * we are seaching for the minimum element and we substract it from the sum
     */
    public static int maximale_summe (int[] inputArray) {

        int minimum = findMinimum(inputArray);
        int summe = 0;
        for (int element: inputArray) {
            summe += element;
        }
        summe -= minimum;
        return summe;
    }

    /**
     *
     * @param inputArray is an array with numbers
     * @return minimum sum of n-1 numbers
     * we are seaching for the maximum element and we substract it from the sum
     */
    public static int minimale_summe (int[] inputArray){
        // findet die minimale Summe von n-1 Zahlen
        // wir finden die maximale Wert und wir substrahieren es von die Summe

        int maximum = findMaximum(inputArray);
        int summe = 0;
        for (int element: inputArray) {
                summe += element;
        }
        summe -= maximum;
        return summe;
    }

}
