public class MainPole {
    public static void main (String [] args){

        FieldsMethods calcField = new FieldsMethods();
        double wynik = calcField.fieldTriangle(5,2);
        System.out.println("Pole trójkąta wynosi: " + wynik);

        wynik =  calcField.fieldSquare(4);
        System.out.println("Pole kwadratu wynosi: " + wynik);

        wynik =  calcField.fieldRectangle(3,6);
        System.out.println("Pole prostokąta wynosi: " + wynik);

        wynik =  calcField.fieldCircle(5);
        System.out.println("Pole koła wynosi: " + wynik);
    }
}