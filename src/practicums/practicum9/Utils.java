package practicums.practicum9;

import java.text.NumberFormat;

public class Utils {
    private static int aantalAangeroepen;

    public static String euroBedrag(double bedrag) {
        return String.format("%.2f",bedrag);
    }
    public static String euroBedrag(double bedrag, int precisie) {
        String precisieString = "%." + precisie + "f";
        return String.format(precisieString, bedrag);

    }
    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314,1));

    }
}
