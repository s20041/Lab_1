/*
Zadanie nr5 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/
public class Customer {

    int ID;
    String name;
    double discount;

    public Customer(int ID,String name, int discount){
        this.ID=ID;
        this.name=name;
        this.discount=discount;
    }

    int getID(int ID){
        return ID;
    }

    String getName(String name){
        return name;
    }

    int getDiscount(int discount){
        return discount;
    }

    void setDiscount(){
        discount=0.3;
    }

    public String toString(){
        return name+" ( "+ID+" )";
    }

}
