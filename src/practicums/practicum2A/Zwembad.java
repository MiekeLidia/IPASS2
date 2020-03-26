package practicums.practicum2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(){

    }
    public Zwembad(double b, double l, double d){
        breedte = b;
        lengte = l;
        diepte = d;
    }
    //setters
    public void setBreedte(double b){ breedte = b; }
    public void setLengte(double l){ lengte = l; }
    public void setDiepte(double d){ diepte = d; }
    //getters
    public double getBreedte()   { return breedte; }
    public double getLengte()   { return lengte; }
    public double getDiepte()   { return diepte; }

    public double inhoud() {
        return breedte*lengte*diepte;
    }

    public String toString(){
        return "Dit zwembad is " +breedte+ " meter breed, "+lengte+" meter lang, en "+diepte+" meter diep";
    }



}
