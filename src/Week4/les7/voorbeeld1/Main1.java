package Week4.les7.voorbeeld1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args)
    {


        //referentie type: type in de declaratie
        //Object type: type van het aangemaakte object

        //dynamishe binding
        //1. het object type bepaald welke methonde wordt uitgevoerd.
        //2. de compliler controleerd of het referentie type de methode bevat.
        //3. tijdens het runnen wordt de methode van het object type uitgevroerd.
        //
        Dier1 dier1; // referenty type = dierd
        Dier1 = new koe(); // object type = koe
        Dier dier2 = new (); Eend(); // referentie type = dier, object type = eend
        Dier dier3 = new Dier(); //referenty type = dier object type = dier
        System.out.println(dier2.speak()); // object type koe => boeh
        System.out.println(dier1.speak());
        System.out.println(dier3..speak());

        ArrayList<Dier> alleBeesten = new ArrayList<Dier>();  //referentietype = Dier
        alleBeesten.add(new koe()); //objectype koe
        alleBeesten.add(new eend()); //object type eend
        alleBeesten.add(new Dier(); // objectype Dier
        For (Dier dier: alleBeesten) {
            System.out.println(dier.speak());
        }
    }
}