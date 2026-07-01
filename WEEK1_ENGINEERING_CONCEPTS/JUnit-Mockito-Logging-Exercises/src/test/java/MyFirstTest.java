
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {

    @Test
    void basicTest() {
        int x = 5;
        assertTrue(x > 0);
        System.out.println("JUnit is working.");
    }
}