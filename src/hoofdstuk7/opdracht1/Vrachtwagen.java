package hoofdstuk7.opdracht1;

public class Vrachtwagen extends Voertuig {
    private int laadvermogen;

    public Vrachtwagen(){
        this("onbekend", "onbekend", 0);
    }

    public Vrachtwagen(String m, int lV){
        this(m, "onbekend", 0);
    }

    public Vrachtwagen(String m, String t, int lV){
        super();
        laadvermogen = lV;

    }

    public String toString(){
        return "Vrachtwagen. Merk: " + super.toString() + ", met een laadvermogen van" + laadvermogen + " ton";
    }

}
