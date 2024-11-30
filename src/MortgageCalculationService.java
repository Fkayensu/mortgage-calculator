public interface MortgageCalculationService {
    double mortgageCalculator();

    double paymentScheduleCalculator(int numberOfPaymentsMade);

    double[] payments();
}
