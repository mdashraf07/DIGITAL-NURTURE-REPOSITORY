public class FinancialForecasting {

    static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double startValue = 100000.0;
        double rate = 0.08;
        int years = 5;

        double result = predictValue(startValue, rate, years);
        System.out.printf("Predicted value after %d years: %.2f%n", years, result);
    }
}