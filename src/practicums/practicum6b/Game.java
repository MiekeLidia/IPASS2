package practicums.practicum6b;



import java.time.LocalDate;
import java.util.Objects;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr ){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }
    public String getNaam(){
        return naam;
    }
    public double huidigeWaarde(){
        return this.nieuwprijs * Math.pow(0.7, LocalDate.now().getYear() - releaseJaar);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return releaseJaar == game.releaseJaar &&
                Double.compare(game.nieuwprijs, nieuwprijs) == 0 &&
                Objects.equals(naam, game.naam);
    }
    public String toString(){
        String s = naam+", uitgegeven in "+releaseJaar+"; nieuwprijs: "+nieuwprijs+" nu voor: "+huidigeWaarde();
        return s;
    }
}
