package week5.les9.voorbeeld1;

public class Klant {
    private String naam, adres;
    private static int aantalKlanten = 0;

    //contstructor
    public Klant(String naam, String adres) {
        this.naam = naam;
        this.adres = adres;
        aantalKlanten++;
        System.out.println(aantalKlanten + "is aangemaakt");
    }

    public static int getAantalKlanten() {
        return aantalKlanten;
    }
}
