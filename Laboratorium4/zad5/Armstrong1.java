/**
 * @author Bartek Bizoń 20041
 * @author Adrian Szostak 19777
 *
 * It is Main class for application from 4nd lesson of JOP
 */

public class Armstrong1 {

    public static void main(String[] args) {

        int liczba = 54748, pierwotnaLiczba, reszta, wynik = 0, n = 0;

        pierwotnaLiczba = liczba;

        for (;pierwotnaLiczba != 0; pierwotnaLiczba /= 10, ++n);

        pierwotnaLiczba = liczba;

        for (;pierwotnaLiczba != 0; pierwotnaLiczba /= 10)
        {
            reszta = pierwotnaLiczba % 10;
            wynik += Math.pow(reszta, n);
        }

        if(wynik == liczba)
            System.out.println(liczba + " jest liczbą Armstronga");
        else
            System.out.println(liczba + " nie jest liczbą Armstronga");
    }
}
