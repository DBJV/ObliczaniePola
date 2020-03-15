package fieldsShapes2;

public class MainShapes {
    public static void main(String[] args) {

        Triangle trojkat = new Triangle();
        trojkat.calculateField(5, 2);

        Rectangle prostokat = new Rectangle();
        prostokat.calculateField(4, 6);

        Shape[] tablica = {new Triangle(), new Triangle(), new Rectangle(), new Rectangle(), new Triangle()};

        tablica[1].calculateField(3, 4);

        System.out.println(" ************************");
        System.out.println("Pierwszy sposob:");

        for (int i = 0; i < tablica.length; i++) {
            tablica[i].calculateField(i, 2);
            System.out.println(i);
        }
        System.out.println("Dla indexu 0 tablicy");
        for (int i = 0; i < tablica.length; i++) {
            tablica[0].calculateField(i, 2);
        }
        System.out.println("Dla indexu 1 tablicy");

        for (int i = 0; i < tablica.length; i++) {
            tablica[1].calculateField(i, 2);
        }        System.out.println("Dla indexu 2 tablicy");

        for (int i = 0; i < tablica.length; i++) {
            tablica[2].calculateField(i, 2);
        }        System.out.println("Dla indexu 3 tablicy");

        for (int i = 0; i < tablica.length; i++) {
            tablica[3].calculateField(i, 2);
        }        System.out.println("Dla indexu 4 tablicy");

        for (int i = 0; i < tablica.length; i++) {
            tablica[4].calculateField(i, 2);
        }
    }
}
