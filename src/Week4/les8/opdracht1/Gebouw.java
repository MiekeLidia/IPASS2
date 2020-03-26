package Week4.les8.opdracht1;

public class Gebouw {
    private int lengte;
    private int breete;
    private int aantalVerdiepingen;
    public int laatsteRenovatie;

    public Gebouw(){
    }

    public Gebouw(int l, int b, int aV){
        lengte = l;
        breete = b;
        aantalVerdiepingen = aV;
    }

    public int oppervlakte(){
        return lengte*breete;
    }

    public void renoveer(int jaarBuiten){
        laatsteRenovatie = jaarBuiten;
    }

    public int berekenHuur(){
        return oppervlakte()*75; //als je mthode gebruikt haakjes!!!
    }

    public String toString() {
        return  "";
    }
}
