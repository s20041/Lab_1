public class Square extends Rectangle {

    protected double side;

    public Square (String color, boolean filled, double width, double length, double side)
    {
        super (color, filled, width, length );
        this.side = side;
    }

    public double getSide ()
    {
        return  side;

    }

    public void setSide (double side)
    {
        this.side = side;
        side = 1.0;
    }

    public void setWidth (double width)
    {
        this.width = width;
        width = 1.0;
    }

    public void setLength (double length)
    {
        this.length = length;
        length = 1.0;
    }

    public void toooooString ()
    {
        System.out.println("Color is " + color + " Filled: " + filled + " Width = " + width + " Length = " + length
                + " Area = " + area + " Perimeter = " + perimeter + " Side = " + side);
    }
}
