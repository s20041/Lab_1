/*
Zadanie nr1 Laboratorium2,  Bartosz Bizoń, Jakub Słomiński
*/

package com.company;

import javax.swing.plaf.basic.BasicButtonUI;

public class Human {

    private int wiek;
    private int waga;
    private int wzrost;
    private String name;
    private String plec;
    private int nrIndeks;
    private int rozmiarStopy;

    private int getAge(int wiek){
        return wiek;
    }
    private int getWeight(int waga){
        return waga;
    }
    private int getHeight(int wzrost){
        return wzrost;
    }
    private String getName(String Name){
        return Name;
    }
    private String isMale(String plec){
        return plec;
    }
    private int getFeetSize(int rozmiarStopy){
        return rozmiarStopy;
    }
    private int getIndexNumber(int nrIndeks){
        return nrIndeks;
    }




    public static void main(String[] args) {
        Human Bartek = new Human();
        Human Kuba = new Human();

        System.out.println("Imie : " + Kuba.getName("Kuba"));
        System.out.println("Wiek : " + Kuba.getAge(20));
        System.out.println("Waga : " + Kuba.getWeight(71));
        System.out.println("Wzrost : " + Kuba.getHeight(175));
        System.out.println("Plec : " + Kuba.isMale("Mezczyzna"));
        System.out.println("RozmiarStopy : " + Kuba.getFeetSize(42));
        System.out.println("Indeks : " + Kuba.getIndexNumber(18552));

        System.out.println();

        System.out.println("Imie : " + Bartek.getName("Bartek"));
        System.out.println("Wiek : " + Bartek.getAge(22));
        System.out.println("Waga : " + Bartek.getWeight(73));
        System.out.println("Wzrost : " + Bartek.getHeight(181));
        System.out.println("Plec : " + Bartek.isMale("Mezczyzna"));
        System.out.println("RozmiarStopy : " + Bartek.getFeetSize(44));
        System.out.println("Indeks : " + Bartek.getIndexNumber(20041));

        // czlowiek.getAge(30);


    }
}