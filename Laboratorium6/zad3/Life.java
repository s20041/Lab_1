public class Life extends Insurance{



    public Life(String type) {
        super(type);
        this.type=type;
    }

    String getType(){
        return type;
    }
    double setCost(){
        price =36;
        return price;
    }

}
