package practicums.practicum8;

import practicums.practicum6a.Game;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        type=tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar=jr;
    }
    public double huidigeWaarde(){
        double kortingPrijs = aanschafPrijs;
        int aantalJaar = LocalDate.now().getYear() - productieJaar;
        for (int i = 0; i < aantalJaar ; i++){
            kortingPrijs = kortingPrijs*0.6;
        }
        return kortingPrijs;
    }

    public boolean equals(Object obj){
        boolean gelijkeObjecten = false; // blijft false tenzij:

        if (obj instanceof Computer) {
            Computer andereComputer = (Computer) obj;

            if (this.type.equals(andereComputer.type) && this.macAdres.equals(andereComputer.macAdres) && this.aanschafPrijs == (andereComputer.aanschafPrijs)  && this.productieJaar == (andereComputer.productieJaar))
            {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
    public String toString(){
        return "Computer: " + type + " met het MAC-adres: " + macAdres + " en productie jaar van: " + productieJaar + " heeft een waarde van: €" + Utils3.euroBedrag(huidigeWaarde());
    }
}
