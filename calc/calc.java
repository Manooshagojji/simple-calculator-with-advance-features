import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Welcome to Advanced Calculator!");
        System.out.println("Available operations: +, -, *, /, ^");
        System.out.println("Type 'quit' to exit.");

        while (true) {
            System.out.print("Enter operator followed by operand: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String[] tokens = input.split(" ");
            if (tokens.length != 2) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            char operator = tokens[0].charAt(0);
            double operand = Double.parseDouble(tokens[1]);

            switch (operator) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case '^':
                    result = Math.pow(result, operand);
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        System.out.println("Thank you for using Advanced Calculator!");
        scanner.close();
    }
}
