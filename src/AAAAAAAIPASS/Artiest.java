package AAAAAAAIPASS;

import java.util.ArrayList;

public class Artiest extends Gebruiker {

    private ArrayList<String> volgers;
    private ArrayList<Post> posts;

    public Artiest(String gn) {
        super(gn);
        volgers = new ArrayList<String>();
        posts = new ArrayList<Post>();
    }

    public boolean addVolgers(Gebruiker g){
        if (!volgers.contains(g.getGebruikersNaam())){
            volgers.add(g.getGebruikersNaam());
            return true;
        } else return false;
    }

    public int aantalVolgers(){
        return volgers.size();
    }

    public String toString() {
        return getGebruikersNaam() + "volgt: " + getVolgend() + "\naantal volgend "+ aantalVolgend() + "\nvolgers aantal: "+ aantalVolgers() +"\nvolgers:"+ volgers + "\n";

    }
}
