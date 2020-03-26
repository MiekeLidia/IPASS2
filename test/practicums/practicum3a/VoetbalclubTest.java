package practicums.practicum3a;

import org.junit.jupiter.api.Test;
import week1.les2.practicum2b.Voetbalclub;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {


    @Test
    void standaardFC(){
        Voetbalclub test = new Voetbalclub("test");
        assertSame("FC", test.);
    }

    @Test
    void geenWGV(){
        Voetbalclub test2 = new Voetbalclub("test2");
        test2.verwerkResultaat('h');
    }

    @Test
    void ongeldigNietInString(){
        Voetbalclub test3 = new Voetbalclub("test3");


    }

}