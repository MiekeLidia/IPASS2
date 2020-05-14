package AAAAAAAIPASS;
import java.util.ArrayList;

public class Gebruiker {
    private String gebruikersNaam;
    private ArrayList<Artiest> volgend;

    public Gebruiker(String gn){
        this.gebruikersNaam = gn;
        volgend = new ArrayList<Artiest>();
    }

    //getters
    public String getGebruikersNaam(){return gebruikersNaam;}

    public boolean volg(Artiest ar) {
        if (!volgend.contains(ar)){
            volgend.add(ar);
            ar.addVolgers(this);
            return true;
        } else return false;
    }

    public Integer aantalVolgend(){
        return volgend.size();
    }




}
