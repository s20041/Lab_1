/*
Zadanie nr1 Laboratorium3,  Bartosz Bizoń
*/
public class zad1 {
    int id;
    String firstName;
    String lastName;
    int salary;

    zad1(int id, String firstName, String lastName, int salary){
        id = 2;
        firstName = "Bartosz";
        lastName = "Bizon";
        salary = 3000;
    }

    public static void main(String args[]){


        zad1 employer = new zad1(2,"Bartosz","Bizon",3000);

    }

    int getId(){
        return id;
    }

    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getname(){
        return firstName;
    }

    int getSalary(){
        return salary;
    }

    void setSalary(int salary){

    }

    int getAnnualSalary(){
        return salary*12;
    }

    int raiseSalary(int salary){
        return salary+(((int)(salary*0.01)));
    }

    String tooString(){
        return "Employee[id= "+id+" ,name= "+firstName +" "+lastName+" ,salary= "+salary+"]";
    }
}
