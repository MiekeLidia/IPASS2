package AAAAAAAIPASS;

import java.util.ArrayList;

public class Artiest extends Gebruiker {
    private ArrayList<Gebruiker> volgers;
    private ArrayList<Post> posts;



    public Artiest(String gn) {
        super(gn);
    }


    public boolean addVolgers(Gebruiker g){
        if (!volgers.contains(g)){
            volgers.add(g);
            return true;
        } else return false;
    }

    public int aantalVolgers(){
        return volgers.size();
    }
}
