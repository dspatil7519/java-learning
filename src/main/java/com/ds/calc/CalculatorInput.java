import java.util.Scanner;

public class CalculatorInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+ - * /) or 'exit': ");
            String operator = scanner.next();

            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("Calculator exited.");
                break;
            }

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            try {
                CalculatorInput calculator = new CalculatorInput();
                result = calculator.calculate(num1, num2, operator);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            System.out.printf("Result: %.2f %s %.2f = %.2f%n",
                    num1, operator, num2, result);
        }

        scanner.close();
    }

     public double calculate(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "^":
                return Math.pow(a, b);
            case "%":
                return a % b;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
