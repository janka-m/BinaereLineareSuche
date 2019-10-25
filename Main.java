public class Main {

    public static void main(String[] args) {
        testTreffer();
        testKeinTreffer();
    }

    private static void testTreffer() {
        // Arrange
        String[] array = {"Anna","Berta","Carla","Dieter", "Emma"};
        String gesucht = "Dieter";

        // Act
        int ergebnis = Suchen.suche(array, gesucht);

        // Assert
        System.out.println("Test treffer: " + (3 == ergebnis));
    }

    private static void testKeinTreffer() {
        // Arrange
        String[] array = {"Anna","Berta","Carla","Dieter", "Emma"};
        String gesucht = "Hubert";

        // Act
        int ergebnis = Suchen.suche(array, gesucht);

        // Assert
        System.out.println("Test kein treffer: " + (-1 == ergebnis));
    }
}
