public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;
    protected double area;
    protected double perimeter;

    public Rectangle (String color, boolean filled, double width, double length)
    {
        super (color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth ()
    {
        return width;
    }

    public void setWidth (double width)
    {
        this.width = width;
        width = 1.0;
    }

    public double getLength ()
    {
        return length;
    }

    public void setLength (double length)
    {
        this.length = length;
        length = 1.0;
    }

    public double getArea ()
    {
        return area;
    }

    public void setArea (double area)
    {
        this.area = area;
        area = 1.0;
    }

    public double getPerimeter ()
    {
        return perimeter;
    }

    public void setPerimeter (double perimeter)
    {
        this.perimeter = perimeter;
        perimeter = 1.0;
    }

    public void tooooString ()
    {
        System.out.println("Color is " + color + " Filled: " + filled + " Width = " + width + " Length = " + length
                + " Area = " + area + " Perimeter = " + perimeter);
    }
}
