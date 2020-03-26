package practicums.practicum4b;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){
    }

    //setters
    public void setAantalDagen(int aD){
        aantalDagen = aD;
    }
    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }
    public void setHuurder(Klant k) {
        huurder = k;
    }

    //getters
    public int getAantalDagen() {
        return aantalDagen;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    public Klant getHuurder(){
        return huurder;
    }


    public double totaalprijs() {
        double p = 0.0;
        if (huurder != null || gehuurdeAuto != null) {
            p = huurder.getKorting() * (aantalDagen * gehuurdeAuto.getPrijsPerDag()) / 100;


        }


        return p;
    }


    public String toString(){
        String s = "";
        if (gehuurdeAuto == null){
            s = "er is geen auto bekend\n";
        }
        if (huurder == null){
            s = s + "er is geen huurder bekend";
        }
        else {
            s = s + huurder + gehuurdeAuto;
        }
         s = s + "aantal dagen: " + aantalDagen + " en dat kost " + totaalprijs() + gehuurdeAuto.getPrijsPerDag();
        return s;
    }


}
