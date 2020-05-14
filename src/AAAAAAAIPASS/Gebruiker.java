package AAAAAAAIPASS;
import java.util.ArrayList;

public class Gebruiker {
    private String gebruikersNaam;
    private ArrayList<String> volgend;

    public Gebruiker(String gn){
        this.gebruikersNaam = gn;
        volgend = new ArrayList<String>();
    }


    //getters
    public String getGebruikersNaam(){return gebruikersNaam;}
    public ArrayList<String> getVolgend(){return volgend;}



    public boolean volg(Artiest ar) {
        if (!volgend.contains(ar.getGebruikersNaam())){
            volgend.add(ar.getGebruikersNaam());
            ar.addVolgers(this);
            return true;
        } else return false;
    }

    public Integer aantalVolgend(){
        return volgend.size();
    }

    public String toString() {
        return "\n"+ gebruikersNaam + "\nvolgt: " + volgend + "\naantal volgend: " + aantalVolgend() + "\n" ;


    }




}
