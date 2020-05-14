package practicums.practicum3a;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class VoetbalclubTest {
    private Voetbalclub club;

    @BeforeEach
    public void init() {
        club = new Voetbalclub("AFCA");
    }

    @Test
    public void testClubnaamMagNietLeegZijn() {
        Voetbalclub club2 = new Voetbalclub("");
        assertEquals(club2.getNaam(), "FC");
    }


    @Test
    public void testGewonnenWedstrijd() {
        club.verwerkResultaat('w');
        assertEquals(1, club.aantalGespeeld());
        assertEquals(3, club.aantalPunten());
        assertTrue(club.toString().contains("1 1 0 0 3"));
    }

    @Test
    public void testGelijkeWedstrijd() {
        club.verwerkResultaat('g');
        assertEquals(1, club.aantalGespeeld());
        assertEquals(1, club.aantalPunten());
        assertTrue(club.toString().contains("1 0 0 1 1"));
    }

    @Test
    public void testVerlorenWedstrijd() {
        club.verwerkResultaat('v');
        assertEquals(1, club.aantalGespeeld());
        assertEquals(0, club.aantalPunten());
        assertTrue(club.toString().contains("1 0 1 0 0"));
    }

    @Test
    public void testFoutiveInvoer() {
        club.verwerkResultaat('q');
        assertEquals(0, club.aantalGespeeld());
        assertEquals(0, club.aantalPunten());
        assertTrue(club.toString().contains("0 0 0 0 0"));
    }

    @Test
    public void testHerhaaldelijkVerwerking() {
        club.verwerkResultaat('g');
        club.verwerkResultaat('w');
        club.verwerkResultaat('v');
        club.verwerkResultaat('g');
        club.verwerkResultaat('g');
        assertEquals(5, club.aantalGespeeld());
        assertEquals(6, club.aantalPunten());
        assertTrue(club.toString().contains("5 1 1 3 6"));
    }

}