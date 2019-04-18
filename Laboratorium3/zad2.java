/*
Zadanie nr2 Laboratorium3,  Bartosz Bizoń
*/
public class zad2 {
    String id;
    String desc;
    double unitPrice;
    int qty;

    zad2 (String id, String desc, double unitPrice, int qty){
        id = "123";
        desc = "ktos";
        unitPrice=123.3;
        qty = 3;
    }

    public static void main(String args[]){


        zad2 something = new zad2("123","ktos",333.2,20);

    }

    String getID(){
        return id;
    }

    String getDesc(){
        return desc;
    }

    int getQty(){
        return qty;
    }

    double getUnitPrice(double unitPrice){
        return unitPrice;
    }

    void setQty(int qty){
        qty=100;
    }

    double getUnitPrice(){
        return unitPrice;
    }

    void setUnitPrice(double unitPrice){

    }

    double getTotal(){
        return unitPrice*qty;
    }


    String tooString(){
        return "Invoice Item[id= "+id+" ,desc= "+desc +" "+qty+" ,salary= "+unitPrice+"]";
    }

}
