/*
Zadanie nr2 Laboratorium6,  Bartosz Bizoñ
*/
public class Circle extends ResizableCircle implements  GeometricObject {

    public double radius=1.0;
    double area;

    public Circle(double radius) {
        super(radius);
    }


    @Override
    public double getParimeter() {
        return radius;
    }

    @Override
    public double getArea() {
        return area;
    }
}
