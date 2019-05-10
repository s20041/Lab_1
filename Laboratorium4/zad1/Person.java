public class Person  {

    protected String name;
    protected String adress;


    public Person(String name, String adress){
        this.name=name;
        this.adress=adress;
    }

    public String getName(){
        return name;
    }

    public String getAdress(){
        return adress;
    }

    public void setAdress(String adress){
        this.adress=adress;
        adress="TEST_ADRES";
    }

    public void tooString(){
        System.out.println("Person [name= "+name+" address= "+adress+"]");
    }

    public static void main(String args[]){

        Person testPerson = new Person("Bartek , ","Testowy_adres");
        Student testStudent = new Student("Bartosz","Testttowy_adres","Informatyka",1997,620);
        Staff testStaff = new Staff("Barteeek","TESTOWY_ADR","PJATK",3000);


        testPerson.tooString();
        testStudent.tooString();
        testStaff.tooString();
    }
}
