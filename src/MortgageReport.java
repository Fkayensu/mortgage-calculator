import java.text.NumberFormat;

public class MortgageReport {
    private final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private MortgageCalculationService calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule(byte period) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double payment:calculator.payments()) {
            String balanceFormatted = currency.format(payment);
            System.out.println(balanceFormatted);
        }
    }

    public void printMortgage() {
        double mortgage = calculator.mortgageCalculator();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
