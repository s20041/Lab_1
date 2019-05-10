/*
Zadanie nr3 Laboratorium4,  Bartosz Bizoń, Adrian Szostak
*/


public class MovablePoint extends Point{

    private float xSpeed;
    private float ySpeed;
    private float[] tabSpeed = new float[2];

    MovablePoint(float x, float y, float ySpeed, float xSpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
        xSpeed=2;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
        ySpeed=2;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        xSpeed=getXSpeed();
        ySpeed=getYSpeed();
    }

    public float[] getSpeed(){

        return tabSpeed;
    }

    public void tooString(){
        System.out.println("X: "+x+", Y: "+y);
    }

    public void move(){
        x=x+xSpeed;
        y=y+ySpeed;
        System.out.println("X: "+x+", Y: "+y);

    }
}
