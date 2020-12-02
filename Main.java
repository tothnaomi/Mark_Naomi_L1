import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] noten = new int[6];
        noten[0] = 29;
        noten[1] = 84;
        noten[2] = 81;
        noten[3] = 19;
        noten[4] = 98;
        noten[5] = 55;

        // Erste Aufgabe
        // 1
        int[] a = Noten.nichtAusreichendeNoten(noten);
        for (int elem : a) System.out.println(elem);

        // 2
        int durch = Noten.Durchschnitt(noten);
        System.out.println(durch);

        // 3
        int[] newN = Noten.rundeteNoten(noten);
        for (int elem : newN) System.out.println(elem);

        // 4
        int maximum = Noten.maximal_abgerundet(noten);
        System.out.println(maximum);

        // Zweite Aufgabe

        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 3;
        arr[3] = 10;
        arr[4] = 17;

        // 1
        int maximum2 = myArray.findMaximum(noten);
        System.out.println(maximum2);

        // 2
        int minimum = myArray.findMinimum(noten);
        System.out.println(minimum);

        // 3
        int maximale_summe = myArray.maximale_summe(arr);
        System.out.println(maximale_summe);

        int minimale_summe = myArray.minimale_summe(arr);
        System.out.println(minimale_summe);

        //problemele 3 si 4
        int[] a2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] rez = new int[100];
        int r;

        //3.1
        rez = U3.sum(a2, b);
        System.out.println(Arrays.toString(rez));

        //3.2
        rez = U3.diff(a2, b);
        System.out.println(Arrays.toString(rez));

        //3.3
        rez = U3.mul(a2, 7);
        System.out.println(Arrays.toString(rez));

        //3.4
        int[] c = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        rez = U3.div(c, 2);
        System.out.println(Arrays.toString(rez));

        //4.1
        r = U4.cheapkeyboard();
        System.out.println(r);

        //4.2
        r = U4.mostexpensive();
        System.out.println(r);

        //4.3
        r = U4.affordable(30);
        System.out.println(r);

        //4.4
        r = U4.buy(63);
        System.out.println(r);
    }
}
