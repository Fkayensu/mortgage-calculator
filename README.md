# Mortgage Calculator

This Java program calculates the monthly mortgage payment and provides a payment schedule based on the provided principal, annual interest rate, and period (years). It prompts the user for input and outputs the mortgage details as well as the remaining balance after each monthly payment.

## Features

- **Monthly Mortgage Calculation**: Calculates and displays the monthly mortgage payment based on the principal, annual interest rate, and loan period.
- **Payment Schedule**: Displays the remaining balance of the loan after each monthly payment for the full loan period.

## How It Works

The mortgage is calculated using the formula:

\[
M = P \times \frac{r \times (1 + r)^n}{(1 + r)^n - 1}
\]

Where:
- \( M \) is the monthly payment.
- \( P \) is the principal (loan amount).
- \( r \) is the monthly interest rate (annual interest rate divided by 12).
- \( n \) is the total number of payments (loan period in years multiplied by 12).

## Usage

1. Run the program in a Java-supported IDE or terminal.
2. Enter the required inputs when prompted:
   - **Principal**: The amount of the loan (between $1,000 and $1,000,000).
   - **Annual Interest Rate**: The interest rate as a percentage (between 0% and 30%).
   - **Period**: The loan term in years (between 1 and 30 years).
3. The program will then display:
   - The monthly mortgage payment.
   - The remaining balance for each payment throughout the entire period.

## Example

- Principal ($1K - $1M): 100000 
- Annual Interest Rate: 5 
- Period (Years): 20

### MORTGAGE
Monthly Payments: $659.96

### PAYMENT SCHEDULE
- $99,340.04 
- $98,675.71 ...


## Installation and Setup

1. Clone this repository to your local machine.
2. Ensure you have the Java Development Kit (JDK) installed.
3. Compile the program:

   ```javac MortgageCalculator.java```
4. Run the program 

   ```java MortgageCalculator ```

## Code Explanation
- readNumber: Reads and validates user input for principal, interest rate and period.
- mortgageCalculator: Calculates the monthly mortgage payment using the given formula.
- paymentScheduleCalculator: Calculates the remaining loan balance after each payment.
- printMortgage: Displays the formatted monthly mortgage payment.
- printPaymentSchedule: Displays the full payment schedule.

