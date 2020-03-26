package practicums.practicum6b;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;


    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
        mijnGames = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (budget >= g.huidigeWaarde() && !mijnGames.contains(g)) {
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g) && !koper.mijnGames.contains(g) && koper.getBudget() >= g.huidigeWaarde()) {
            budget += g.huidigeWaarde();
            mijnGames.remove(g);
            koper.mijnGames.add(g);
            koper.budget -= g.huidigeWaarde();
            return true;
        }
        return false;
    }
    public Game zoekGameOpNaam(String naam) {
        for (Game game : mijnGames) {
            if(game.getNaam().equals(naam)){
                return game;
            }
        }
        return null;
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> alleGames) {
        ArrayList<Game> nietInBezit = new ArrayList<>();
        for (Game ga : alleGames) {
            if (!mijnGames.contains(ga)) {
                nietInBezit.add(ga);
            }
        }
        return nietInBezit;
    }

    public String toString() {
        String s = naam + " heeft een budget van " + String.format("%.2f",budget) + " en bezit de volgende games: \n";
        for (Game g : mijnGames) {
            s += g.toString() + "\n";
        }
        return s;
    }
}
