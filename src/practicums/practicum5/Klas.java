//package practicums.practicum5;
//
//import java.util.ArrayList;
//
//public class Klas {
//    private String klasCode;
//    private ArrayList<Leerling> leerlingen;
//
//    public Klas(String kC){
//        klasCode = kC;
//        leerlingen = new ArrayList<Leerling>();
//    }
//
//    public void voegLeerlingToe(Leerling l){
//        leerlingen.add(l);
//    }
//    public void wijzigCijfer(String nm, double nweCijfer){
//
//    }
//    public ArrayList<Leerling> getLeerlingen(){
//        return leerlingen;
//    }
//    public int aantalLeerlingen(){
//        return leerlingen.size();
//    }
//    public String toString(){
//        StringBuilder tekst = new StringBuilder("In klas " + klasCode + " zitten de volgende leerlingen:\n");
//        for (Leerling leerling : leerlingen){
//            tekst.append(leerling).append("\n");
//        }
//        return tekst.toString();
//}
//
//}
