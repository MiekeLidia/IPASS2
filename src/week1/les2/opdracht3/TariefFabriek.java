package week1.les2.opdracht3;

public class TariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven b1 = new BelastingTarieven();

        String loop = "ja";
        while (loop == "ja")
        try {
            b1.produceerBelastingTarieven();
            loop = "nee";

        } catch (ArithmeticException ae) {
            System.out.println("kan niet door 0 delen");
            loop = "ja";



        }
    }
}
