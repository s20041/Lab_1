/*
Zadanie nr7 Laboratorium3,  Bartosz Bizoń
*/

import java.util.Arrays;
public class palindrom {

    public static void main(String args[]){

        palindrom testPalindrom = new palindrom();

        String wyraz = "kajak";
        String wyraz1 = "atak kata";
        String wyraz2 = "muzo raz daj jad za rozum";
        String wyraz3 = "wódy żal dla żydów";
        testPalindrom.testowanie(wyraz);
        testPalindrom.testowanie(wyraz1);
        testPalindrom.testowanie(wyraz2);
        testPalindrom.testowanie(wyraz3);
    }

    void testowanie(String wyraz){
        char[] tabWyraz = wyraz.toCharArray();
        char[] tabWyrazOdwrot = new char[tabWyraz.length];
        for(int i=0; i<tabWyraz.length; i++){
            tabWyrazOdwrot[i]=tabWyraz[tabWyraz.length-1-i];
        }
        System.out.println(Arrays.toString(tabWyraz));
        System.out.println(Arrays.toString(tabWyrazOdwrot));

        if((Arrays.toString(tabWyraz)).equals(Arrays.toString(tabWyrazOdwrot))){
            System.out.println(wyraz+" jest palindromem");
            System.out.println(" ");
        }else{
            System.out.println(wyraz+" nie jest palindromem");
            System.out.println(" ");
        }

    }

}
