package Week4.les8.opdracht1;

public class Main {
    public static void main(String[] args) {
        Gebouw g1 = new Gebouw();
        Gebouw g2 = new Gebouw(8,5,2);
        System.out.println(g1);
        System.out.println(g2);
        g2.renoveer(1999);
        System.out.println(g2);
        System.out.println(g2.oppervlakte());
        System.out.println(g2.berekenHuur());

    }
}
