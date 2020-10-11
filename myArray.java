public class myArray {

    public static int findMaximum (int[] inputArray) {
        // findet die maximale Wert in einem Array

        int maximum = inputArray[0];
        for(int elem: inputArray) {
            if (elem>maximum) maximum = elem;
        }
        return maximum;
    }

    public static int findMinimum (int[] inputArray) {
        // findet die minimale Wert in einem Array

        int minimum = inputArray[0];
        for(int elem: inputArray) {
            if (elem<minimum) minimum = elem;
        }
        return minimum;
    }

    public static int maximale_summe (int[] inputArray) {
        // findet die maximale Summe von n-1 Zahlen
        // wir finden die minimale Wert und wir substrahieren es von die Summe

        int minimum = findMinimum(inputArray);
        int summe = 0;
        for (int element: inputArray) {
            summe += element;
        }
        summe -= minimum;
        return summe;
    }

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
