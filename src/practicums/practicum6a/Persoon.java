package practicums.practicum6a;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games;

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
        games = new ArrayList<Game>();
    }

    public boolean koop(Game g) {

        if (!games.contains(g) && (g.huidigeWaarde() < budget)) {
            games.add(g);
            return true;
        } else return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (games.contains(g) && !koper.games.contains(g) && (koper.budget > g.huidigeWaarde())) {
            koper.budget = koper.budget - g.huidigeWaarde();
            koper.games.add(g);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> alleGames) {
        ArrayList<Game> nietInBezit = new ArrayList<>();
        for (Game ga : alleGames) {
            if (!games.contains(ga)) {
                nietInBezit.add(ga);
            }
        }
        return nietInBezit;
    }




    public String toString(){ 
        String tekst = " Heeft een budget van €"+ String.format("%.2f",budget) + " en bezit de volgende video games:\n" ;
        for (Object item : games)
        {
            tekst = tekst + item;
        }
        return tekst;
    
    }
}
