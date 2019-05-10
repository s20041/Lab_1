public class Point3D extends Point2D {

    private float z;
    private float[] tabXYZ= new float[3];

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ(){
        return z;
    }

    public void setZ(float z){
        this.z=z;
        z=3;
    }

    public void setXYZ(){
        setX(2);
        setY(5);
        setZ(3);
    }

    public float[] getXYZ(){
        return tabXYZ;
    }

    public void tooString(){
        System.out.println("X: "+x+", Y: "+y+" , Z: "+z);
    }

}
