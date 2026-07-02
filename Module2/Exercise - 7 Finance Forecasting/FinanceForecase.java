public class FinanceForecast {

    public static double futureValue(double currentValue, double growthRate, int years) {

        System.out.printf("Years Remaining: %d, Current Value: %.2f%n", years, currentValue);

        if (years == 0) {
            System.out.println("Completed!");
            return currentValue;
        }

        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double future = futureValue(presentValue, growthRate, years);

        System.out.printf("%nFinal Future Value = %.2f%n", future);
    }
}
