import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static float PERCENTAGE = 0.01F;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        double annualInterestRate = readNumber("Annual Interest Rate: ", 0, 30);
        byte period = (byte) readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterestRate, period);
        printPaymentSchedule(period, principal, annualInterestRate);
    }

    private static void printMortgage(int principal, double annualInterestRate, byte period) {
        double mortgage = mortgageCalculator(principal, annualInterestRate, period);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(byte period, int principal, double annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        int numberOfPaymentsMade = 0;
        int totalNumberOfPayments = MONTHS_IN_YEAR * period;
        for (int i = 0; i < totalNumberOfPayments; i++) {
            ++numberOfPaymentsMade;
            double balance = paymentScheduleCalculator(principal, annualInterestRate, period, numberOfPaymentsMade);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();

            if (!(value >= min && value <= max))
                System.out.println("Enter a value between " + min + "and " + max);
            else
                break;
        }
        return value;
    }

    public static double mortgageCalculator(
            int principal,
            double annualInterestRate,
            byte period
    ) {
        double monthlyInterestRate = (PERCENTAGE * annualInterestRate)/MONTHS_IN_YEAR;

        double unitFormula = Math.pow((1+monthlyInterestRate), (period * MONTHS_IN_YEAR));

        return (principal)*((monthlyInterestRate*(unitFormula))/((unitFormula)-1));
    }

    public static double paymentScheduleCalculator(
            int principal,
            double annualInterestRate,
            byte period,
            int numberOfPaymentsMade
    ){
        double monthlyInterestRate = (PERCENTAGE * annualInterestRate)/MONTHS_IN_YEAR;
        int numberOfPayments = MONTHS_IN_YEAR * period;

        return (principal*(Math.pow(1+monthlyInterestRate,numberOfPayments) -
                Math.pow(1+monthlyInterestRate, numberOfPaymentsMade))) /
                (Math.pow(1+monthlyInterestRate, numberOfPayments) - 1);
    }
}