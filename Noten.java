public class Noten {

    /**
     *
     * @param note is an integer
     * @return the rounded grade
     * if the difference between the grade and the next multiple of 5 is less than 3 than the grade will be rounded to the multiple of 5
     */
    public static int runden(int note) {
        // Ob die Differenz zwischen die Note und die nächste multipel von 5 weniger als 3
        // ist, dann wird die Note zu die nächste multipel von 5 abgerunde
        // Ob die Note kleiner als 38 ist, wird die Note nicht abgerundet.

        if (note > 38) {
            int multipleVon5 = note;

            while (multipleVon5 % 5 != 0) {
                multipleVon5++;
            }

            if (multipleVon5 - note < 3) {
                note = multipleVon5;
            }
        }
        return note;
    }

    /**
     *
     * @param Note is an integer
     * @return true if the note is greater than 40, otherwise return false
     */
    public static boolean ausreichend(int Note) {
        return Note >= 40;
    }

    /**
     *
     * @param noten is an array of integers, which are grades
     * @return all the grades, which are not sufficient
     */
    public static int[] nichtAusreichendeNoten(int[] noten) {
        // liefert die Noten die nicht ausreichend sind von dem Array mit Name noten

        int[] returnArray = new int[noten.length];
        int anzahl = 0;
        for (int i: noten) {
            if (!ausreichend(i)) {
                returnArray[anzahl] = i;
                anzahl++;
            }
        }
        return returnArray;
    }

    /**
     *
     * @param noten an array of integers (grades)
     * @return the durchschnitt
     */
    public static int Durchschnitt(int[] noten) {
        // Methode bekommt ein Array von Noten
        // Als die Rückgabewert soll die Methode den Durchschnittswert liefern.

        int sum=0;
        for (int elem: noten) {
            sum += elem;
        }

        return sum/noten.length;
    }

    /**
     *
     * @param noten is an array of grades
     * @return an array with the rounded grades
     */
    public static int[] rundeteNoten(int[] noten) {

        int[] newNoten = new int[noten.length];
        for (int i=0;i<noten.length;i++) {
            int new_note = runden(noten[i]);
            newNoten[i] = new_note;
        }
        return newNoten;
    }
    

    public static int maximal_abgerundet(int[] noten) {
        int[] newNoten = rundeteNoten(noten);

        // wir suchen nach der maximales Element
        int maxValue = newNoten[0];
        for(int i=1;i < newNoten.length;i++){
            if(newNoten[i] > maxValue){
                maxValue = newNoten[i];
            }
        }
        return maxValue;
    }
}
