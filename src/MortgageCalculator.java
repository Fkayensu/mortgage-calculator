public class MortgageCalculator implements MortgageCalculationService {
    private final float PERCENTAGE = 0.01F;
    private final byte MONTHS_IN_YEAR = 12;
    
    private int principal;
    private double annualInterest;
    private byte period;

    public MortgageCalculator(int principal, double annualInterest, byte period) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.period = period;
    }

    @Override
    public double mortgageCalculator() {
        double unitFormula = Math.pow((1 + getMonthlyInterestRate()), getNumberOfPayments());
        return (principal) * ((getMonthlyInterestRate() * (unitFormula)) / ((unitFormula) - 1));
    }

    @Override
    public double paymentScheduleCalculator(int numberOfPaymentsMade) {
        return (principal * (Math.pow(1 + getMonthlyInterestRate(), getNumberOfPayments()) -
                Math.pow(1 + getMonthlyInterestRate(), numberOfPaymentsMade))) /
                (Math.pow(1 + getMonthlyInterestRate(), getNumberOfPayments()) - 1);
    }

    @Override
    public double[] payments() {
        var balance = new double[getNumberOfPayments()];
        for (int numberOfPaymentsMade = 1; numberOfPaymentsMade <= balance.length; ++numberOfPaymentsMade) {
            balance[numberOfPaymentsMade - 1] = paymentScheduleCalculator(numberOfPaymentsMade);
        }
        return balance;
    }

    public int getNumberOfPayments() {
        return period * MONTHS_IN_YEAR;
    }

    public double getMonthlyInterestRate() {
        return (PERCENTAGE * annualInterest) / MONTHS_IN_YEAR;
    }
}
