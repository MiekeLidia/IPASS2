package practicums.practicum5_1;

import java.util.ArrayList;

public class Klas {
    private ArrayList<Leerling> leerlingen;
    private String klasCode;
    public Klas(String kC){
        klasCode = kC;
        leerlingen = new ArrayList<>();
    }
    public void voegLeerlingToe(Leerling l){
        leerlingen.add(l);
    }
    public void wijzigCijfer(String nm, double nweCijfer) {
            for (Leerling lr : leerlingen) {
                if (lr.getNaam().equals(nm)) {
                    lr.setCijfer(nweCijfer);
                }
            }
        }
    //getters
    public ArrayList<Leerling> getLeerlingen(){
        return leerlingen;
    }
    public int aantalLeerlingen(){
        return leerlingen.size();
    }
    public String toString(){
        String s = "In klas" + klasCode+ "zitten de volgende leerlingen: \n";
        for (Leerling ll : leerlingen){
            s = s + ll;
        }
        return s;
    }

}
