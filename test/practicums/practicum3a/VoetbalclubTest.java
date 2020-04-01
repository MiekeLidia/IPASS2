package practicums.practicum3a;

import org.junit.jupiter.api.Test;
import week1.les2.practicum2b.Voetbalclub;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {


    @Test
    //Eis: als de clubnaam null of leeg ("") is, moet de naam "FC" gebruikt worden.
    void standaardFC(){
        Voetbalclub test = new Voetbalclub("");
        System.out.println(test); //werkt niet, geen fc
        //Voetbalclub test3 = new Voetbalclub(); WERKT NIET net null
        //System.out.println(test3);

    }
    @Test
    //Eis: het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op.
        //Foutieve invoer mag het puntensaldo en totaalaantal gespeelde wedstrijden niet beïnvloeden!
    //Eis: het verwerken van de resultaten ‘w’, ‘g’ en ‘v’ levert respectievelijk 3, 1 en 0 punten op,
        // en is zichtbaar in de stringrepresentatie van de toString-methode.
    void geenWGV(){
        Voetbalclub test2 = new Voetbalclub("test2");
        test2.verwerkResultaat('h');
        test2.verwerkResultaat('g');
        test2.verwerkResultaat('w');
        System.out.println("juiste uitvoer = 2 1 0 4\ntest uivoer: " );
        System.out.println(test2);
    }


}