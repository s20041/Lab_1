package com.company;
/*
Zadanie nr 2 Laboratorium nr 2 Dzialania na prostokatach
Bartosz Bizoń, Jakub Słomińskis

*/

public class Prostokat {


    private int dlugosc;
    private int szerokosc;

    public int obliczPole(int dlugosc,int szerokosc){
        int pole;
        pole = dlugosc*szerokosc;
        return pole;
    }

    public int obliczObwod(int dlugosc, int szerokosc){
        int obwod;
        obwod = (2*dlugosc)+(2*szerokosc);
        return obwod;
    }

    public double dlugoscPrzekatnej(int dlugos, int szerokosc){

        double kwadratA = Math.pow(dlugosc,2);
        double kwadratB = Math.pow(szerokosc,2);
        double sumaKwadratow = kwadratA+kwadratB;
        return Math.sqrt(sumaKwadratow);

    }

    public static void main(String args[]){
        Prostokat nowyProstokat = new Prostokat();

        System.out.println("Pole prostokata: "+nowyProstokat.obliczPole(4,5));
        System.out.println("Obwod prostokata: "+nowyProstokat.obliczObwod(4,5));
        System.out.println("Przekatna prostokata: "+nowyProstokat.dlugoscPrzekatnej(4,5));
    }

}
