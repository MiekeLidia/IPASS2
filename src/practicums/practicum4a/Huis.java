package practicums.practicum4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huibaas;

    public Huis(String adr, int bwjr){
        adres = adr;
        bouwjaar = bwjr;
    }
    public void setHuisbaas(Persoon hb){
        huibaas = hb;
    }

    public Persoon getHuisbaas(){
        return huibaas;
    }

    public String toString(){
        return "Huis " + adres + " is gebouwd in " + bouwjaar +  "\nen heeft huisbaas " + huibaas;
    }
}
