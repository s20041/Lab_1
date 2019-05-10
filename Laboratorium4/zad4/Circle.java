public class Circle extends Shape {

    protected double radius = 1.0;
    protected double area;
    protected double perimeter;

    public Circle (String color, boolean filled, double radius)
    {
        super (color, filled);
        this.radius = radius;
    }

    public double getRadius ()
    {
        return radius;
    }

    public void setRadius (double radius)
    {
        this.radius = radius;
        radius = 1.0;
    }

    public double getArea ()
    {
        return area;
    }

    public double getPerimeter ()
    {
        return perimeter;
    }

    public void toooString ()
    {
        System.out.println("Color is " + color + " Filled: " + filled + " Radius = " + radius
        + " Area = " + area + " Perimeter = " + perimeter);
    }
}
