package AAAAAAAIPASS;

public class Main {
    public static void main(String[] args) {
        Artiest artiest1 = new Artiest("artiest1");
        Artiest artiest2 = new Artiest("artiest2");
        Artiest artiest3 = new Artiest("artiest3");
        Artiest artiest4 = new Artiest("artiest4");

        Gebruiker gebruiker1 = new Gebruiker("gebruiker1");
        Gebruiker gebruiker2 = new Gebruiker("gebruiker2");
        Gebruiker gebruiker3 = new Gebruiker("gebruiker3");
        Gebruiker gebruiker4 = new Gebruiker("gebruiker4");

        System.out.println("gebruiker1 volgt artiest1:" + (gebruiker1.volg(artiest1) ? "" : " niet") + " gelukt");
        System.out.println("gebruiker1 volgt artiest1:" + (gebruiker1.volg(artiest1) ? "" : " niet") + " gelukt");
        System.out.println("gebruiker1 volgt artiest3:" + (gebruiker1.volg(artiest3) ? "" : " niet") + " gelukt");
        System.out.println("gebruiker2 volgt artiest4:" + (gebruiker2.volg(artiest4) ? "" : " niet") + " gelukt");
        System.out.println("gebruiker3 volgt artiest1:" + (gebruiker3.volg(artiest1) ? "" : " niet") + " gelukt");
        System.out.println("gebruiker4 volgt artiest3:" + (gebruiker4.volg(artiest3) ? "" : " niet") + " gelukt");

        System.out.println(gebruiker1);
        System.out.println(gebruiker2);
        System.out.println(gebruiker3);
        System.out.println(gebruiker4);

        System.out.println(artiest1);
        System.out.println(artiest2);
        System.out.println(artiest3);
        System.out.println(artiest4);

//        Game game1 = p1.zoekGameOpNaam("Just Cause 3");
//        System.out.println("p1 heeft Just Cause 3 " + (game1 != null ? "wel!" : "niet!"));
//
//        ArrayList<Game> teKoop = new ArrayList<Game>();
//        teKoop.add(g1);
//        teKoop.add(new Game("Mario Kart 8", 2019, 35.00));
//        ArrayList<Game> nogNietInBezit = p1.bepaalGamesNietInBezit(teKoop);
//        System.out.println("p1 heeft de volgende games nog niet: " + nogNietInBezit.toString());
    }
}
