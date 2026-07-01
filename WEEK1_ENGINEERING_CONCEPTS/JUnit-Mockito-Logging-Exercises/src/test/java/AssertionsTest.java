
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testEquals() {
        int total = 2 + 3;
        assertEquals(5, total);
    }

    @Test
    void testTrueFalse() {
        String name = "Ashraf";
        assertTrue(name.startsWith("A"));
        assertFalse(name.isEmpty());
    }

    @Test
    void testNullCheck() {
        String val = null;
        assertNull(val);

        String city = "Chennai";
        assertNotNull(city);
    }
}