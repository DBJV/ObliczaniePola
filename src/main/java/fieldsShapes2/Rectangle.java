package fieldsShapes2;

public class Rectangle implements Shape {
    public void calculateField(int a, int h) {
        int pole = a*h;
        System.out.println("Pole prostokata wynosi: " + pole);
    }
}
