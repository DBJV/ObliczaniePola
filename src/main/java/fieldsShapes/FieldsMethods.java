package fieldsShapes;

public class FieldsMethods {

    public int fieldTriangle(int a, int h){
        int pole = (a * h)/2;
        return  pole;
    }

    public double fieldSquare (int a){
        double pole = Math.pow(4,2);
        return pole;
    }
    public double fieldRectangle(int a, int b){
        double pole = a * b;
        return pole;
    }
    public double fieldCircle (double r){
        double pole = Math.PI * Math.pow(r,2);
        return pole;
    }
}
