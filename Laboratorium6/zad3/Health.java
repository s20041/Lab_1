public class Health extends Insurance{



    public Health(String type) {
        super(type);
        this.type=type;
    }

    String getType(){
        return type;
    }

    double setCost(){
        price =196;
        return price;
    }


}
