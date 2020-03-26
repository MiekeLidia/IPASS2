package practicums.practicum8;

public abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }
    public boolean equals(Object obj){
        boolean gelijkeObjecten = false; // blijft false tenzij:
        if (obj instanceof Voertuig) {
            Voertuig anderVoertuig = (Voertuig) obj;

            if (this.type.equals(anderVoertuig.type)  && this.nieuwprijs == (anderVoertuig.nieuwprijs)  && this.bouwjaar == (anderVoertuig.bouwjaar))
            {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
    public String toString(){
        return "Voertuig: " + type + " met bouwjaar " +bouwjaar + " heeft een waarde van: €" + Utils3.euroBedrag(huidigeWaarde());
    }



}
