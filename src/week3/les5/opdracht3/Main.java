package week3.les5.opdracht3;

import week5.les9.voorbeeld1.Klant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        Eigenaar e1 = new Eigenaar("Willem de Moller");
        System.out.println(e1);
        e1.setBeestje( new Huisdier("Nero", "Dobermann") );
        System.out.println(e1);
        System.out.println();

        Eigenaar e2 = new Eigenaar("Pluk");
        System.out.println(e2);
        e2.setBeestje( new Huisdier("Zaza", "kakkerlak") );
        System.out.println(e2);
        System.out.println();

        System.out.println(e1.getBeestje());
        System.out.println(e2.getBeestje());

        ArrayList<Huisdier> huisdieren = new ArrayList<Huisdier>();
        Huisdier h1 = new Huisdier("Jan de Wit","Siamees");
        Huisdier h2 = new Huisdier("Lilly", "Vuilnisbak");
        huisdieren.add(h1);
        huisdieren.add(h2);
        huisdieren.add(new Huisdier("Peer","Siamees"));
        int aantal = huisdieren.size();
        System.out.println(aantal);
        for (Huisdier h : huisdieren){
            System.out.println(h);
        }
        huisdieren.add(0,new Huisdier(("Teo"),"vuilnisbak"));
        huisdieren.set(2,(new Huisdier("poes", "vuilnisbak")));
        for (Huisdier h : huisdieren){
            System.out.println(h);
        }



    }
}
