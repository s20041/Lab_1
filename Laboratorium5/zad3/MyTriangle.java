public class MyTriangle extends  MyPoint {

    int x;
    int y;
    int x1,x2,x3,y1,y2,y3;
    String type;

    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }

    public void v1(int x1, int y1){
        this.x1=x1;
        this.y1=y1;
        System.out.println("x1: "+x1+" y1:"+y1);
    }

    public void v2(int x2, int y2){
        this.x2=x2;
        this.y2=y2;
        System.out.println("x2: "+x2+" y2:"+y2);
    }

    public void v3(int x3, int y3){
        this.x3=x3;
        this.y3=y3;
        System.out.println("x3: "+x3+" y3:"+y3);
    }

    String toString(){

    }

    double getParimeter(){}

    String getType(String type){
        if(){
            type="Equilateral";
        }
        else if(){
            type="Isosceles";
        }
        else if(){
            type="Scalene";
        }
    }



    public static void main(String[] args) {
        MyPoint punkt = new MyPoint();
        MyTriangle triangle = new MyTriangle();


    }
}
