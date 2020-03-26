package voorbeeld;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Winkel winkel = new Winkel("Jumbo Parkwijk");
        Klant klant1 = new Klant("Jan", "Nijenoord 1", "Utrecht");
        Klant klant2 = new Klant("Wim", "Oudenoord 340", "Utrecht");
        winkel.voegKlantToe(klant1);
        winkel.voegKlantToe(klant2);
        System.out.println(winkel);
        winkel.voegKlantToe(new Klant("Isabella", "Domplein 1", "Utrecht"));
        System.out.println(winkel);
        winkel.voegKlantToe(new Klant("Jan", "Nijenoord 1", "Utrecht"));
        System.out.println(winkel);
        winkel.verwijderKlant(klant1);
        System.out.println(winkel);
        System.out.println(winkel.getKlanten());
        ArrayList<Klant> klantenlijst = winkel.getKlanten();
        for (Klant klant: klantenlijst) {
            System.out.println(klant);
        }
    }
}
