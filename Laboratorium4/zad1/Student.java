/*
Zadanie nr1 Laboratorium4,  Bartosz Bizoń, Adrian Szostak
*/

public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String adress,String program,int year, double fee){
        super(name,adress);
        this.program = program;
        this.year=year;
        this.fee=fee;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program=program;
        program="TEST_Program";
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year=year;
        year=1998;
    }

    public double getFee(){
        return fee;
    }

    public void setFee(){
        this.fee=fee;
        fee=123.3;
    }

    public void tooString(){
        System.out.println("Student[Person[name= "+name+" , adress= "+adress+"]" +
                ", program= "+program+", year= "+year+", fee= "+fee+" ]");
    }





}
