import java.util.Arrays;

public class Suchen {
    // binäre Suche
    public static int suche(String[] array, String gesucht) {
        Arrays.sort(array);

        int linkerRand = 0;
        int rechterRand = array.length - 1;

        while (linkerRand <= rechterRand) {
            int mitte = (linkerRand + rechterRand) / 2;
            if (array[mitte].compareTo(gesucht) < 0) {
                linkerRand = mitte + 1;
            } else if (array[mitte].compareTo(gesucht) > 0) {
                rechterRand = mitte - 1;
            } else {
                return mitte;
            }
        }
        return -1;
    }

    // lineare Suche
    public static int lineareSuche(String[] array, String gesucht) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(gesucht)) {
                return i;
            }
        }
        return -1;
    }
}
