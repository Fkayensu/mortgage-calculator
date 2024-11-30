import java.text.NumberFormat;

public class MortgageReport {

    private static CalculateMortgage calculator;

    public static void printMortgage(int principal, double annualInterestRate, byte period) {
        calculator = new CalculateMortgage(principal, annualInterestRate, period);
        double mortgage = calculator.mortgageCalculator();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(byte period, int principal, double annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        int numberOfPaymentsMade = 0;
        int totalNumberOfPayments = MortgageCalculator.MONTHS_IN_YEAR * period;
        for (int i = 0; i < totalNumberOfPayments; i++) {
            ++numberOfPaymentsMade;
            double balance = calculator.paymentScheduleCalculator(numberOfPaymentsMade);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
    }
}
