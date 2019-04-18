/*
Zadanie nr4 Laboratorium3,  Bartosz Bizoń
*/
public class zad4 {

    int day;
    int month;
    int year;

    zad4 (int day, int month, int year){
        day=12;
        month=1;
        year=1999;
    }


    public static void main(String args[]){


        zad4 something = new zad4(12,3,1999);

    }

    int getDay(){
        return  day;
    }

    int getMonth(){
        return month;
    }

    int getYear(){
        return year;
    }

    void setDay(int day){
        day=20;
    }

    void setMonth(int month){
        month=3;
    }
    void setYear(int year){
        year=20;
    }

    void setDate(int day, int month, int year){
        day=20;
        month=3;
        year=1999;
    }

    String tooString(){
        return "[ "+day+"/"+month+"/"+year+" ]";
    }

}
