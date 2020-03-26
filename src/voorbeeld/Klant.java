package voorbeeld;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    public Klant(String nm, String adr, String pl) {
        naam = nm;
        plaats = pl;
        adres = adr;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setNaam(String nm) {
        naam = nm;
    }

    public void setAdres(String adr) {
        adres = adr;
    }

    public void setPlaats(String pl) {
        plaats = pl;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;
        if (andereObject instanceof Klant) {
            Klant andereKlant = (Klant) andereObject;
            if (this.naam.equals(andereKlant.naam) &&
                    this.adres.equals(andereKlant.adres) &&
                    this.plaats.equals(andereKlant.plaats)) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString() {
        String s = naam + " woont op " + adres + " in " + plaats;
        return s;
    }
}
