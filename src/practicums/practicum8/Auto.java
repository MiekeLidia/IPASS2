package practicums.practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp,pr,jr);
        kenteken = kt;

    }
    public double huidigeWaarde(){
        double kortingPrijs = super.nieuwprijs;
        int aantalJaar = LocalDate.now().getYear() - super.bouwjaar;
        for (int i = 0; i < aantalJaar ; i++){
            kortingPrijs = kortingPrijs*0.7;
        }
        return kortingPrijs;
    }
    public boolean equals(Object obj){
        boolean gelijkeObjecten = false; // blijft false tenzij:

        if (obj instanceof Auto) {
            Auto andereAuto = (Auto) obj;
            if (this.kenteken == (andereAuto.kenteken))
            {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
