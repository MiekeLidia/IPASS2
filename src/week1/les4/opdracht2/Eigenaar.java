package week1.les4.opdracht2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setGiroNr(int nr) { giroNr = nr; }

    public int getGiroNr()  { return giroNr; }
    public String getNaam() { return naam; }

    public String toString() {
        return naam + " heeft giro " + giroNr+". En is het baasje van" + beestje;
    }


    public void setBeestje(Huisdier h) {
        beestje = h;
    }

    public Huisdier getBeestje() {
        return beestje;
    }



}
