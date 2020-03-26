package practicums.practicum8;

import practicums.practicum9.Utils;

import java.text.NumberFormat;

public class Utils3 {
    private static int aantalAangeroepen;
    private static String resultaat;

    public static void algemeen(double bedrag, int precisie){
        resultaat = String.format("%." + precisie + "f",bedrag);
        aantalAangeroepen = aantalAangeroepen+1;
    }
    public static String euroBedrag(double bedrag) {
        Utils3.algemeen(bedrag,2);
        return resultaat;
    }
    public static String euroBedrag(double bedrag, int precisie) {
        Utils3.algemeen(bedrag,precisie);
        return resultaat;


    }

}
