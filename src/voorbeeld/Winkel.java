package voorbeeld;

// klasse Klant moet een equals-methode hebben

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Winkel {
    private String naam;
    // 1. attribuut toevoegen met de rolnaam
    private ArrayList<Klant> klanten;

    public Winkel(String naam) {
        this.naam = naam;
        // 2. in de constructor een nieuwe ArrayList aanmaken
        this.klanten = new ArrayList<Klant>();
    }

    // 3. getter toevoegen om klanten op te vragen
    public ArrayList<Klant> getKlanten() {
        return klanten;
    }

    // 4. een methode om een klant toe te voegen, die controleert of de klant er al in staat
    public void voegKlantToe(Klant klant) {
        if (!klanten.contains(klant)) {
            klanten.add(klant);
        }
    }

    // 5. een methode om een klant te verwijderen
    public void verwijderKlant(Klant klant) {
        klanten.remove(klant);
    }

    // 6. toString uitbreiden
    public String toString() {
        String s = "De winkel heet " + naam;
        if (klanten.isEmpty()) {
            s += "en de winkel heeft nog geen klanten";
        }
        else {
            s += "\nDe winkel heeft de volgende klanten:\n";
            for (Klant klant: klanten) {
                s += klant + "\n";
            }
        }
        return s;
    }
}
