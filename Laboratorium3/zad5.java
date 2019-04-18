/*
Zadanie nr5 Laboratorium3,  Bartosz Bizoń
*/
public class zad5 {

    int hour;
    int minute;
    int second;

    zad5 (int hour,int minute, int second){
        hour=12;
        minute=1;
        second=19;
    }


    public static void main(String args[]){


        zad5 something = new zad5(12,3,19);

    }

    int getHour(){
        return  hour;
    }

    int getMinute(){
        return minute;
    }

    int getSecond(){
        return second;
    }

    void setHour(int hour){
        hour=20;
    }

    void setMinute(int minute){
        minute=3;
    }
    void setSecond(int second){
        second=20;
    }

    void setTime(int hour, int minute, int second){
        hour=20;
        minute=3;
        second=1999;
    }

    String tooString(){
        return "[ "+hour+"/"+minute+"/"+second+" ]";
    }

    String nextSecond(){
        return "[ "+hour+"/"+minute+"/"+(second+1)+" ]";
    }

}
