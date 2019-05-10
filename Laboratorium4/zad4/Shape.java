/**
 * @author Bartek Bizoń 20041
 * @author Adrian Szostak 19777
 *
 * It is Main class for application from 4nd lesson of JOP
 */

public class Shape {

    protected String color = "red";
    protected boolean filled = true;

    public Shape (String color, boolean filled)
    {
        this.color = color;
        this.filled = true;
    }

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
        color = "red";
    }

    public boolean isFilled ()
    {
        return filled;
    }

    public void setFilled (boolean filled)
    {
        this.filled = filled;
        filled = true;
    }

    public void tooString ()
    {
        System.out.println("Color is " + color + " Filled: " + filled);
    }

    public static void main(String[] args)
    {
        Shape testShape = new Shape("blue", true);
        Circle testCircle = new Circle("yellow", true, 5.0);
        Rectangle testRectangle = new Rectangle("green", true, 10.0, 10.0);
        Square testSquare = new Square ("pink", true, 15.0, 15.0, 15.0);

        testShape.tooString();
        testCircle.toooString();
        testRectangle.tooooString();
        testSquare.toooooString();
    }
}
