
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class VerifyTest {

    @Test
    void testVerify() {
        PaymentService paymentService = mock(PaymentService.class);

        paymentService.processPayment(200);
        paymentService.processPayment(200);

        verify(paymentService, times(2)).processPayment(200);
        System.out.println("Method was called the expected number of times.");
    }
}