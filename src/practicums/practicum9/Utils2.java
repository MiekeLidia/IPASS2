package practicums.practicum9;

import java.text.NumberFormat;

public class Utils2 {
    private static int aantalAangeroepen;
    private static String resultaat;

    public static void algemeen(double bedrag, int precisie){
        resultaat = String.format("%." + precisie + "f",bedrag);
        aantalAangeroepen = aantalAangeroepen+1;
    }
    public static String euroBedrag(double bedrag) {
        Utils2.algemeen(bedrag,2);
        return resultaat;
    }
    public static String euroBedrag(double bedrag, int precisie) {
        Utils2.algemeen(bedrag,precisie);
        return resultaat;


    }
    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314,1));

    }
}
