package hoofdstuk6.opdracht2;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList vrienden;

    public FacebookAccount(String nm){
        naam = nm;
        vrienden = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend nwV){
        if (!vrienden.contains(nwV)){
            vrienden.add(nwV);
        }
    }

    public boolean verwijderVriend(Vriend exV){
        if (vrienden.contains(exV)){
            vrienden.remove(exV);
            return true;
        }
        else return false;
    }

    public boolean isVriendMet(Vriend v){
        return vrienden.contains(v);
    }

    public int aantalVrienden(){
        return vrienden.size();
    }

    public String toString(){
        return "";
    }
}
