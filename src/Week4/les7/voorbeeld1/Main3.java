package Week4.les7.voorbeeld1;

public class Main3 {
    public static void main(String[] args) {
        //referentie type: type in de declaratie
        //Object type: type van het aangemaakte object

        //dynamishe binding
        //1. het object type bepaald welke methonde wordt uitgevoerd.
        //2. de compliler controleerd of het referentie type de methode bevat.
        //3. tijdens het runnen wordt de methode van het object type uitgevroerd.
        Koe koe1 = new Koe; //referenty type = koe, objecttype = koe
        koe.out.println(koe1.speak());

        Dier dier1 = new Koe(); // referenty type = dier, object type = koe
        System.out.println(dier1.speak());

        Ened eend1 = new Eend(); //referenty type is een , objecttype is eend
        System.out.println(eend1.getAantalPoten());
        // subklase heeft methode niet => gat zoeken naar methode in superklasse.
        // als die er is voer die die methode uit.
        //als superkallse de methode niet heeft, werkt de dynamishe binding nieet.
        //oplossen met casten
        Koe koe2 = (Koe)dier2;
        System.out.println(koe2);
        koe2.setLitersMelk(30);
        System.out.println(koe2);
        ((Koe)dier2).setLitersMelk(30);

        Dier3 dier3 = new Dier(); // referenty type en objecttype is dier
        Eend eend2 = new Eend(); //  referenty type en objecttype is dier
        dier3 = eend2; //object type van dier 3 word eend
        System.out.println(dier2.speak());
    }
}
