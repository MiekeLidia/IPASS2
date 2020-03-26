package practicums.practicum4b;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }

    public void setKorting(double kP) {
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString(){
        return "op naam van: " + naam + " (korting: " + kortingsPercentage + "%)\n";
    }
}
