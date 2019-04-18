/*
Zadanie nr6 Laboratorium3,  Bartosz Bizoń
*/

public class zad6 {

    String name;
    int salary;
    String date;


    zad6(){

    }


    public static void main(String args[]){


        zad6[] pracownicy = new zad6[8];
        pracownicy[0]  = new zad6();
        pracownicy[0].setAll("Bartek",3900,"18/01/1997");
        pracownicy[1] = new zad6();
        pracownicy[1].setAll("Marek",6200,"12/02/1999");
        pracownicy[2] = new zad6();
        pracownicy[2].setAll("Marcin",3500,"28/03/2010");
        pracownicy[3] = new zad6();
        pracownicy[3].setAll("Natalia",3300,"04/08/2019");
        pracownicy[4] = new zad6();
        pracownicy[4].setAll("Lukasz",3400,"08/10/2008");
        pracownicy[5] = new zad6();
        pracownicy[5].setAll("Piotr",2920,"11/05/1999");
        pracownicy[6] = new zad6();
        pracownicy[6].setAll("Michal",2100,"23/03/1990");
        pracownicy[7] = new zad6();
        pracownicy[7].setAll("Stefan",4200,"10/11/2002");

        zad6 listaPracownikow = new zad6();
        listaPracownikow.piszPracownikow(pracownicy);



    }
    void setAll(String nazwa,int wynagrodzenie, String dataZatrudnienia){
        name=nazwa;
        salary=wynagrodzenie;
        date=dataZatrudnienia;
    }

    String getName(){
        return name;
    }
    int getSalary(){
        return salary;
    }
    String getDate(){
        return date;
    }

    void piszPracownikow(zad6 pracownicy[]) {
        for (int i = 0; i < 8; i++) {
            System.out.println("ID: "+(i+1)+" // "+(pracownicy[i]).getName()+" "+(pracownicy[i]).getSalary()+" "+(pracownicy[i]).getDate());
        }
    }
}
