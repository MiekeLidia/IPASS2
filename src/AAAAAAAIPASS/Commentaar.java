package AAAAAAAIPASS;

import java.util.ArrayList;

public class Commentaar {
    private String naamGebruiker;
    private String bericht;

    public Commentaar(String nmG, String ber){
        this.naamGebruiker = nmG;
        this.bericht = ber;
    }

    //getters
    public String getNaamGebruiker() {return naamGebruiker;}
    public String getBericht() {return bericht;}
}
