package hoofdstuk7.opdracht1;

public class Voertuig {
    private String merk;
    private String type;

    //constructors
    public Voertuig(){
        this("onbekend", "onbekend");
    }

    public Voertuig(String m){
        this(m,"onbekend");
    }

    public Voertuig(String m, String t){
        merk = m;
        type = t;
    }


    //methode
    public String toString(){
        return "Merk: " + merk + ", type: "+ type;
    }

}
