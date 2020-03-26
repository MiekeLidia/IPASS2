package practicums.practicum3a;


public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        this.naam = naam;
    }
    public String getNaam(){
        return naam;
    }
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
        return (aantalGewonnen*3)+aantalGelijk;
    }
    public int aantalGespeeld() {
        return aantalGelijk+aantalGewonnen+aantalVerloren;
    }
    public String toString(){
        return naam+": "+(aantalGewonnen+aantalGelijk+aantalVerloren)+aantalGewonnen+aantalGelijk+aantalVerloren;
    }

    public void setNaam(String fc) {
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }
}
