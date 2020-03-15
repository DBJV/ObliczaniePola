package fieldsShapes2;

public class Triangle implements Shape{

    public void calculateField(int a, int h) {
        int pole = (a*h)/2;
        System.out.println("Pole trójkąta wynosi: " + pole);
    }
}
