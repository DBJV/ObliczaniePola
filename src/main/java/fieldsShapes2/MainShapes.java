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

        for (int i = 0; i < tablica.length; i++) {
            tablica[i].calculateField(i, 2);
            System.out.println(i);
        }
    }
}
