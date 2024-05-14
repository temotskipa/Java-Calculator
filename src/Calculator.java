import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        String input1 = scanner.nextLine();

        System.out.println("Enter second number:");
        String input2 = scanner.nextLine();

        boolean isDecimal = input1.contains(".") || input2.contains(".");

        if (isDecimal) {
            try {
                BigDecimal num1 = new BigDecimal(input1);
                BigDecimal num2 = new BigDecimal(input2);

                System.out.println("Select an operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        BigDecimal sum = CalculatorOperations.add(num1, num2);
                        System.out.println("Sum: " + sum);
                        break;
                    case 2:
                        BigDecimal difference = CalculatorOperations.subtract(num1, num2);
                        System.out.println("Difference: " + difference);
                        break;
                    case 3:
                        BigDecimal product = CalculatorOperations.multiply(num1, num2);
                        System.out.println("Product: " + product);
                        break;
                    case 4:
                        try {
                            BigDecimal quotient = CalculatorOperations.divide(num1, num2);
                            System.out.println("Quotient: " + quotient);
                        } catch (ArithmeticException e) {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operation selected.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        } else {
            try {
                BigInteger num1 = new BigInteger(input1);
                BigInteger num2 = new BigInteger(input2);

                System.out.println("Select an operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Remainder 6. Power");
                int operation = scanner.nextInt();

                switch (operation) {
                    case 1:
                        BigInteger sum = CalculatorOperations.add(num1, num2);
                        System.out.println("Sum: " + sum);
                        break;
                    case 2:
                        BigInteger difference = CalculatorOperations.subtract(num1, num2);
                        System.out.println("Difference: " + difference);
                        break;
                    case 3:
                        BigInteger product = CalculatorOperations.multiply(num1, num2);
                        System.out.println("Product: " + product);
                        break;
                    case 4:
                        try {
                            BigDecimal quotient = CalculatorOperations.divide(num1, num2);
                            System.out.println("Quotient: " + quotient);
                        } catch (ArithmeticException e) {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    case 5:
                        BigInteger remainder = CalculatorOperations.remainder(num1, num2);
                        System.out.println("Remainder: " + remainder);
                        break;
                    case 6:
                        BigInteger power = CalculatorOperations.power(num1, num2);
                        System.out.println("Power: " + power);
                        break;
                    default:
                        System.out.println("Invalid operation selected.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid whole number.");
            }
        }
    }
}