public class FinancialForecasting {

    static double forecast(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double principal = 10000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = forecast(principal, growthRate, years);

        System.out.printf("Future Value = %.2f%n", futureValue);
    }
}