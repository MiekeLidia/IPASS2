package practicums.practicum8;

import practicums.practicum6a.Game;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsNaam;
    private double budget;
    private ArrayList<Goed> goederen;

    public BedrijfsInventaris(String nm, double bud){
        bedrijfsNaam = nm;
        budget = bud;
        goederen = new ArrayList<Goed>();
    }
    public void schafAan(Goed g){
        if (!goederen.contains(g) && (g.huidigeWaarde() < budget)){
            goederen.add(g);
            budget = budget - g.huidigeWaarde();
        }
    }
    public String toString(){
        String s = bedrijfsNaam + "heeft in bezit:\n";
        for (Object item : goederen)
        {
            s = s + item + "\n" ;
        }
        return s;
    }
}
