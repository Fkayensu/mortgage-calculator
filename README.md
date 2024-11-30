# Mortgage Calculator

This Java program calculates the monthly mortgage payment and provides a payment schedule based on the provided principal, annual interest rate, and period (years). It features an object-oriented design to improve modularity and readability.

## Features

- **Object-Oriented Design**: Implements interfaces and classes to separate concerns and enable extensibility.
- **Monthly Mortgage Calculation**: Calculates and displays the monthly mortgage payment based on the principal, annual interest rate, and loan period.
- **Payment Schedule**: Displays the remaining balance of the loan after each monthly payment for the full loan period.
- **Console Input Validation**: Ensures user inputs are within valid ranges.

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
<img width="933" alt="Screenshot 2024-10-19 at 6 09 35 PM" src="https://github.com/user-attachments/assets/7c0202bb-6ddf-444d-b9ae-ad909ed0ef77">

## Installation and Setup

1. Clone this repository to your local machine.
2. Ensure you have the Java Development Kit (JDK) installed.
3. Compile all classes:

   ```sh
   javac Main.java MortgageCalculator.java Console.java MortgageReport.java MortgageCalculationService.java
   ```
4. Run the program:

   ```sh
   java Main
   ```

## Code Explanation

### Key Classes and Interfaces
- **`Main`**: The entry point, handles user interaction and ties together the components.
- **`MortgageCalculator`**: Implements `MortgageCalculationService` for calculating mortgages and payment schedules.
- **`MortgageCalculationService`**: Defines methods for mortgage calculation, payment schedules, and payment generation.
- **`Console`**: Handles user input with validation.
- **`MortgageReport`**: Formats and displays the mortgage and payment schedule.
