
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
        System.out.println("Calculator ready");
    }

    @AfterEach
    void teardown() {
        System.out.println("Test done");
    }

    @Test
    void testAdd() {
        // Arrange
        int a = 10, b = 5;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testSubtract() {
        int a = 10, b = 3;
        int result = calc.subtract(a, b);
        assertEquals(7, result);
    }
}