public class Point2D {

    protected float x = 0.0f;
    protected float y = 0.0f;
    protected float[] tabXY= new float[2];

    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x=x;
        x=2;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y=y;
        y=5;
    }

    public void setXY(){
        setX(2);
        setY(5);
    }

    public float[] getXY(){
        return tabXY;
    }

    public void tooString(){
        System.out.println("X: "+x+", Y: "+y);
    }


    public static void main(String[] args) {

        Point2D testP2d = new Point2D(10,8);
        Point3D testP3d = new Point3D(15,23,10);

        testP2d.tooString();
        testP3d.tooString();

    }
}
