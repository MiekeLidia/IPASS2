package week1.les2.opdracht1.practicum2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    void berekenInhoud(){
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);

        assertEquals(16.5,z1.inhoud(),"inhoud klopt niet");



    }




}