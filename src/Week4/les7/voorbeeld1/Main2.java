package Week4.les7.voorbeeld1;

import javax.management.ValueExp;

public class Main2 {
    public static void main(String[] args) {
        //van supertype naar subtype
        Koe koe1 = new Koe();
        Dier dier1 = koe1;
        System.out.println(dier1);
        // subtype naar supertype => implicite casting

        //van supertype naar subtype
        Dier dier2 = new koe();

        Koe koe2 = (kow)dier2;
        System.out.println(koe2);

        //lijst met dieren
        //alleen als een koe is wil ikde methode setliters Melk gebruiken
        //cheken emt instatief, casten en dan methode aanroepen
        for (Dier dier: alleBeesten) {
            if (dier instanceof koe){
                Koe koe(koe)dier;
                koe.setLitersMelk(40);
                System.out.println(koe);
            }
            if (dier instanceof Eend) {
                Eend eend = (Eend)dier;
                eend.setKanVliegen((true);
                System.out.println(eend.speak());
                System.out.println(eend);
            }
        }
    }
}
