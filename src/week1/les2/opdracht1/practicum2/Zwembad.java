package week1.les2.opdracht1.practicum2;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double le, double di) {
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public Zwembad() {
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        return breedte *lengte*diepte;
    }

    public void setBreedte(double sb) {
        breedte = sb;
    }

    public void setLengte(double sl) {
        lengte = sl;
    }

    public void setDiepte(double sd) {
        diepte = sd;
    }


    public String toString() {
        return "Dit zwembad is "+ breedte + " meter breed, " + lengte+ " meter lang, en " + diepte +  "meter diep";
    }
}
