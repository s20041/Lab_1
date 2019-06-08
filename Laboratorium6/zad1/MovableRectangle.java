/*
Zadanie nr1 Laboratorium6,  Bartosz Bizoñ
*/
public class MovableRectangle extends MovablePoint implements Movable {

    int x1, y1, x2, y2, xSpeed, ySpeed;

    public MovableRectangle(int x, int y, int x1, int y1, int x2, int y2, int xSpeed,int ySpeed){
        super(x,y,xSpeed,ySpeed);
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    MovablePoint topLeft;
    MovablePoint bottomRight;

    @Override
    public void moveUp() {
        topLeft.ySpeed-=topLeft.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.ySpeed+=topLeft.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.xSpeed-=topLeft.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.xSpeed+=topLeft.xSpeed;
    }

    public String toString(){
        return "x1: "+x1+" y1: "+y1+
                " x2: "+x2+"y2: "+y2+
                " xSpeed: "+xSpeed+" ySpeed: "+ySpeed;
    }

    public static void main(String[] args) {

        MovableRectangle test = new MovableRectangle(0,0,1,1,2,2,5,5);
    }

}
