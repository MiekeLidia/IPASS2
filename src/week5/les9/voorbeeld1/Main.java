package week5.les9.voorbeeld1;

public class Main {
    public static void main(String[] args) {
        System.out.println("het aanal kalten is "+ Klant.getAantalKlanten());
        Klant klant1 = new Klant("henk", "njd");
        Klant klant2 = new Klant("henk","njd");
        Klant klant3 = new Klant("henk", "njd");
        System.out.println("het aanal kalten is "+ Klant.getAantalKlanten());





    }
}
