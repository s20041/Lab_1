/*
Zadanie nr1 Laboratorium2,  Bartosz Bizoń, Jakub Słomiński
*/

package com.company;

public class szyfr {

    String testString;

    private void szyfrCezara(String testString){

        char[] stringToCharArray = testString.toCharArray();
        System.out.print("Przed szyfrowaniem : ");
        System.out.println(stringToCharArray);
        System.out.print("Po szyfrowaniu : ");
        for(int i=0; i<stringToCharArray.length;i++){
            stringToCharArray[i]=++stringToCharArray[i];
            System.out.print(stringToCharArray[i]=stringToCharArray[i]);
        }
    }

    public static void main(String args[]){

    szyfr szyfrujHaslo = new szyfr();

    szyfrujHaslo.testString="superhaslo";

    szyfrujHaslo.szyfrCezara(szyfrujHaslo.testString);

    }
}
