
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockingTest {

    @Test
    void testStubbing() {
        PaymentService paymentService = mock(PaymentService.class);

        when(paymentService.processPayment(500)).thenReturn(true);

        boolean result = paymentService.processPayment(500);
        assertTrue(result);
    }
}
