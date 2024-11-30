public class CalculateMortgage {
    private int principal;
    private double annualInterestRate;
    private byte period;

    public CalculateMortgage(int principal, double annualInterestRate, byte period) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.period = period;
    }

    public double mortgageCalculator(
            ) {
        double monthlyInterestRate = (MortgageCalculator.PERCENTAGE * annualInterestRate) / MortgageCalculator.MONTHS_IN_YEAR;

        double unitFormula = Math.pow((1 + monthlyInterestRate), (period * MortgageCalculator.MONTHS_IN_YEAR));

        return (principal) * ((monthlyInterestRate * (unitFormula)) / ((unitFormula) - 1));
    }

    public double paymentScheduleCalculator(int numberOfPaymentsMade) {
        double monthlyInterestRate = (MortgageCalculator.PERCENTAGE * annualInterestRate) / MortgageCalculator.MONTHS_IN_YEAR;
        int numberOfPayments = MortgageCalculator.MONTHS_IN_YEAR * period;

        return (principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) -
                Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
