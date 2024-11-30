//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static float PERCENTAGE = 0.01F;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        double annualInterestRate = Console.readNumber("Annual Interest Rate: ", 0, 30);
        byte period = (byte) Console.readNumber("Period (Years): ", 1, 30);

        MortgageReport.printMortgage(principal, annualInterestRate, period);
        MortgageReport.printPaymentSchedule(period, principal, annualInterestRate);
    }

}