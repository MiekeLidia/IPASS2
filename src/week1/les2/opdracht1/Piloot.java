package week1.les2.opdracht1;

public class Piloot {
    //atributten 3
    private String naam;
    private double salaris;
    private int uuren;


    //constructor
    public Piloot(String nm) {
        naam = nm;
    }

    //methoden
    public void setSalaris(double sa) {
        salaris = sa;
    }

    public double getSalaris() {
        return salaris;
    }

    public int getVlieguren() {
        return uuren;
    }

    public void verhoogVliegurenMet(double extra) {
        uuren = uuren + uuren;
    }

    public String toString() {
        String s = naam +" heeft " + uuren + " uuren gemaakt en verdient " + salaris;
        return s;


    }
}