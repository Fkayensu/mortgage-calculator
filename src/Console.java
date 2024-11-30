import java.util.Scanner;

public class Console {
    private final Scanner scanner = new Scanner(System.in);

    public double readNumber(String prompt, double min, double max) {
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
}
