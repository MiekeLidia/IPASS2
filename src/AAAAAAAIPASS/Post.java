package AAAAAAAIPASS;

import practicums.practicum6a.Game;

import java.util.ArrayList;

public class Post {
    private String titel;
    private String inhoud;
    private ArrayList<Commentaar> berichten;


    public Post(String ti, String inh){
        this.titel = ti;
        this.inhoud = inh;
        berichten = new ArrayList<Commentaar>();
    }
    //getters
    public String getTitel() {return titel;}
    public String getInhoud() {return inhoud;}

    public void krijgCommentaar(Commentaar c) {
        berichten.add(c);
    }

    public String toString() {
        return "";
    }



}
