package week1.les2.practicum2b;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week1.les2.opdracht1.practicum2.Zwembad;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {



    @Test
    public void testClubnaamMagNietLeegZijn() {
        Voetbalclub club = new Voetbalclub("");
        assertEquals(club.getClubNaam(), "FC");
    }


}