public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String adress,String school, double pay){
        super(name,adress);
        this.school=school;
        this.pay=pay;
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school=school;
        school="Szkola";
    }

    public double getPay(){
        return pay;
    }

    public void setPay(){
        this.pay=pay;
        pay=3000;
    }

    public void tooString(){
        System.out.println("Student[Person[name= "+name+" , adress= "+adress+"]" +
                ", school= "+school+", pay= "+pay+" ]");
    }
}
