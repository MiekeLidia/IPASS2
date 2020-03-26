package week1.les4.opdracht1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;



    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public void setBaasje(Eigenaar e){
        baasje = e;

    }


    public Eigenaar getBaasje(){
        return baasje;
    }

    public String getNaam() { return naam; }
    public String getRas()  { return ras; }

    public String toString() {
       String s = naam + ", de " + ras + ", weegt " + gewicht + " kg.";
        if (baasje == null) {
            s = s + "En de eigenaar is:" + baasje;
        }
        else {
            s = s + ";\nEn de eigenaar is: " + baasje;
        }
        return s;

    }


}

