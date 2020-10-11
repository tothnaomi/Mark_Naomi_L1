public class Noten {

    public static int runden(int Note) {
        // Ob die Differenz zwischen die Note und die nächste multipel von 5 weniger als 3
        // ist, dann wird die Note zu die nächste multipel von 5 abgerunde
        // Ob die Note kleiner als 38 ist, wird die Note nicht abgerundet.

        if (Note > 38) {
            int multipleVon5 = Note;

            while (multipleVon5 % 5 != 0) {
                multipleVon5++;
            }

            if (multipleVon5 - Note < 3) {
                Note = multipleVon5;
            }
        }
        return Note;
    }

    public static boolean ausreichend(int Note) {
        return Note >= 40;
    }

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

    public static int Durchschnitt(int[] noten) {
        // Methode bekommt ein Array von Noten
        // Als die Rückgabewert soll die Methode den Durchschnittswert liefern.

        int sum=0;
        for (int elem: noten) {
            sum += elem;
        }

        return sum/noten.length;
    }

    public static int[] rundeteNoten(int[] noten) {
        // Methode bekommt ein Array von Noten
        // Als die Rückgabewert soll die Methode eine Array mit die abgerundete Note liefern

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
