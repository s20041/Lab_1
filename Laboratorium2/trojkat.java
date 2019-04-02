/*
Zadanie nr1 Laboratorium2,  Bartosz Bizoń, Jakub Słomiński
*/

package com.company;

import static java.lang.StrictMath.sqrt;

public class trojkat {

    private double bokA;
    private double bokB;
    private double bokC;

    private double obliczPole(double bokA,double bokB, double bokC){
        double p=0.5*(bokA+bokB+bokC);
        double pole;
        pole=(p*(p-bokA)*(p-bokB)*(p-bokC));
        double poleFinal= sqrt(pole);

        return poleFinal;
    }

    private double obliczObwod(double bokA,double bokB, double bokC){
        double obwod=bokA+bokB+bokC;
        return obwod;
    }


    private void isEqualiteral(double bokA,double bokB, double bokC){ // Rownoboczny
        if(bokA==bokB&&bokA==bokC&&bokB==bokC){
            System.out.println("Trojkat jest rownoboczny");
        }

    }

    private void isIsosceles(double bokA,double bokB, double bokC){ // Rownoramienny
        if(bokA==bokB||bokA==bokC||bokB==bokC){
            System.out.println("Trojkat jest rownoramienny");
        }
    }

    private void isScalene(double bokA,double bokB, double bokC){ // Różnoboczny
        if(bokA!=bokB&&bokA!=bokC&&bokB!=bokC){
            System.out.println("Trojkat jest rożnoboczny");
        }
    }



    public static void main(String[] args) {
        trojkat abc = new trojkat();

        abc.bokA=3;
        abc.bokB=4;
        abc.bokC=5;

        System.out.println("Obwod Trojkata to "+abc.obliczObwod(abc.bokA,abc.bokB,abc.bokC));
        System.out.println("Pole Trojkata to "+abc.obliczPole(abc.bokA,abc.bokB,abc.bokC));
        abc.isIsosceles(abc.bokA,abc.bokB,abc.bokC);
        abc.isScalene(abc.bokA,abc.bokB,abc.bokC);
        abc.isEqualiteral(abc.bokA,abc.bokB,abc.bokC);

    }
}
