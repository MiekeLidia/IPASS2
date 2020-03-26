package Week4.les8.opdracht1;

public class Huis extends Gebouw{
    public boolean isGeisoleerd;
    public int laatsteRenovatie;







    //constructors
    public Huis(){
    }

    public Huis(boolean isG){
        isGeisoleerd = isG;
    }

    public Huis(int l, int b, int aV){
        super(l,b,aV);
    }

    public Huis(int l, int b, int aV, boolean isG){
        super(l,b,aV);
        isGeisoleerd = isG;
    }

    //methoden

    public void isoleer(){
        isGeisoleerd = true;
    }

    public void renoveer(int binnen){
        laatsteRenovatie = binnen;
    }

    public void renoveer(int binnen, int buiten){
        laatsteRenovatie = binnen;
        //super.laatsteRenovatie = buiten;
        super.renoveer(buiten);
    }

    public int berekenHuur(){
        return oppervlakte()*100;
    }

    public String toString(){
        String s = super.toString() + "\n";
        String welNiet = (isGeisoleerd ? "wel": "niet");
        s += "het huis is" + welNiet + "geisoleerd en de laatste binnen renovatie was in" + laatsteRenovatie;
        return s;
    }


}
