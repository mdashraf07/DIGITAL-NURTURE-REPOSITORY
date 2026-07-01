
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankApp {

    static Logger logger = LoggerFactory.getLogger(BankApp.class);

    public static void main(String[] args) {
        logger.info("BankApp started");

        int balance = 500;
        int withdrawAmount = 1000;

        if (withdrawAmount > balance) {
            logger.warn("Withdrawal amount exceeds balance. Amount: {}", withdrawAmount);
        }

        try {
            int result = balance / 0;
        } catch (ArithmeticException e) {
            logger.error("Something went wrong: {}", e.getMessage());
        }

        logger.info("BankApp finished");
    }
}