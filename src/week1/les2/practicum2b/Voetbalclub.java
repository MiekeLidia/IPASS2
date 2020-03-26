package week1.les2.practicum2b;

public class Voetbalclub {
    private String clubNaam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String cn) {
        clubNaam = cn;
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
       return aantalGewonnen*3+aantalGelijk;
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;

    }


    public String toString() {
        return clubNaam +" " + aantalGespeeld() +" "+ aantalGewonnen+" " + aantalVerloren +" "+ aantalPunten();
    }
}
