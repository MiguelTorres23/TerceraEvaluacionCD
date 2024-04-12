ackage refactorizacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramDetectorTest {

    @Test
    void testAreAnagrams() {
        assertTrue(AnagramDetector.areAnagrams("listen", "silent"));
        assertTrue(AnagramDetector.areAnagrams("debit card", "bad credit"));
     
    }



@Test
void testNoAreAnagrams() {
    assertFalse(AnagramDetector.areAnagrams("1", "2"));
    assertFalse(AnagramDetector.areAnagrams("3", "4"));
    assertFalse(AnagramDetector.areAnagrams("5", "6"));
    assertFalse(AnagramDetector.areAnagrams("7", "8"));
}
}

