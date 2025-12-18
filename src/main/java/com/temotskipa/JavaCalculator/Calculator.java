package com.temotskipa.JavaCalculator;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {
    public static void handleDecimal(String input1, String input2) {
        try {
            BigDecimal num1 = new BigDecimal(input1);
            BigDecimal num2 = new BigDecimal(input2);

            String opInput = IO.readln("Select an operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division");
            if (opInput == null) {
                IO.println("No operation selected.");
                return;
            }
            int operation;
            try {
                operation = Integer.parseInt(opInput.trim());
            } catch (NumberFormatException e) {
                IO.println("Invalid operation selected.");
                return;
            }

            switch (operation) {
                case 1 -> IO.println("Sum: " + CalculatorOperations.add(num1, num2));
                case 2 -> IO.println("Difference: " + CalculatorOperations.subtract(num1, num2));
                case 3 -> IO.println("Product: " + CalculatorOperations.multiply(num1, num2));
                case 4 -> {
                    try {
                        IO.println("Quotient: " + CalculatorOperations.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        IO.println("Cannot divide by zero.");
                    }
                }
                default -> IO.println("Invalid operation selected.");
            }
        } catch (NumberFormatException e) {
            IO.println("Invalid input. Please enter a valid decimal number.");
        }
    }

    public static void handleInteger(String input1, String input2) {
        try {
            BigInteger num1 = new BigInteger(input1);
            BigInteger num2 = new BigInteger(input2);

            String opInput = IO.readln("Select an operation: 1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Remainder 6. Power");
            if (opInput == null) {
                IO.println("No operation selected.");
                return;
            }
            int operation;
            try {
                operation = Integer.parseInt(opInput.trim());
            } catch (NumberFormatException e) {
                IO.println("Invalid operation selected.");
                return;
            }

            switch (operation) {
                case 1 -> IO.println("Sum: " + CalculatorOperations.add(num1, num2));
                case 2 -> IO.println("Difference: " + CalculatorOperations.subtract(num1, num2));
                case 3 -> IO.println("Product: " + CalculatorOperations.multiply(num1, num2));
                case 4 -> {
                    try {
                        IO.println("Quotient: " + CalculatorOperations.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        IO.println("Cannot divide by zero.");
                    }
                }
                case 5 -> {
                    try {
                        IO.println("Remainder: " + CalculatorOperations.remainder(num1, num2));
                    } catch (ArithmeticException e) {
                        IO.println("Cannot divide by zero.");
                    }
                }
                case 6 -> {
                    try {
                        IO.println("Power: " + CalculatorOperations.power(num1, num2));
                    } catch (ArithmeticException e) {
                        IO.println("Exponent must be a non-negative integer within 32-bit range.");
                    }
                }
                default -> IO.println("Invalid operation selected.");
            }
        } catch (NumberFormatException e) {
            IO.println("Invalid input. Please enter a valid whole number.");
        }
    }
}
