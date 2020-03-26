package practicums.practicum8;

import practicums.practicum6a.Persoon;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int productieJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
        int productieJaar2 = LocalDate.now().getYear() - 2; // 1 jaar geleden
        int productieJaar3 = LocalDate.now().getYear() - 3; // 1 jaar geleden



        BedrijfsInventaris b1 = new BedrijfsInventaris("Bedrijf1", 200000);

        Computer c1 = new Computer("Huawei", "00:1B:44:11:3A:B7", 800, productieJaar1);
        Computer c2 = new Computer("Huawei", "00:1B:44:11:3A:B7", 800, productieJaar1);
        Fiets f1 = new Fiets("Hert", 250, productieJaar2,12345);
        Fiets f2 = new Fiets("Hert", 250, productieJaar2,12345);
        Auto a1 = new Auto("susuki",17000,productieJaar3,"00-GP-9");
        Auto a2 = new Auto("susuki",17000,productieJaar3,"00-GP-9");

        b1.schafAan(c1);
        b1.schafAan(c2);
        b1.schafAan(f1);
        b1.schafAan(f2);
        b1.schafAan(a1);
        b1.schafAan(a2);

        System.out.println(b1);




    }
}
