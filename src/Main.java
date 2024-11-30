//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int principal = (int) new Console().readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        double annualInterestRate = new Console().readNumber("Annual Interest Rate: ", 0, 30);
        byte period = (byte) new Console().readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterestRate, period);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule(period);
    }
}