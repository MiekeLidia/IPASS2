package practicums.practicum6a;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;

public class Game {


    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rj, double nwpr){
        naam = nm;
        releaseJaar = rj;
        nieuwprijs = nwpr;
    }

    public String getNaam() { return naam; }

    public double huidigeWaarde(){
        double kortingPrijs = nieuwprijs;
        int aantalJaar = LocalDate.now().getYear() - releaseJaar;
        for (int i = 0; i < aantalJaar ; i++){
            kortingPrijs = kortingPrijs*0.7;
        }

        return kortingPrijs;
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false; // blijft false tenzij:

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) &&        // zie vooor 'this'
                    this.releaseJaar == (andereGame.releaseJaar))
            {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public String toString()
    {
        //String s = String.valueOf(huidigeWaarde());
        return naam + ", uitgegeven in " + releaseJaar + "; nieuw prijs: €" + nieuwprijs + " nu voor: €" + String.format("%.2f", huidigeWaarde()) + "\n";}
}
