package practicums.practicum8;

import practicums.practicum6a.Game;

import java.time.LocalDate;

public class Fiets extends Voertuig{
    private int frameNummer;

    public Fiets(String tp, double pr, int jr, int frn){
        super(tp,pr,jr);
        frameNummer = frn;
    }
    public double huidigeWaarde(){
        double kortingPrijs = super.nieuwprijs;
        int aantalJaar = LocalDate.now().getYear() - super.bouwjaar;
        for (int i = 0; i < aantalJaar ; i++){
            kortingPrijs = kortingPrijs*0.9;
        }
        return kortingPrijs;
    }
    public boolean equals(Object obj){
        boolean gelijkeObjecten = false; // blijft false tenzij:

        if (obj instanceof Fiets) {
            Fiets andereFiets = (Fiets) obj;
            if (this.frameNummer == (andereFiets.frameNummer))
            {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

}
