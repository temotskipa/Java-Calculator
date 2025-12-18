package com.temotskipa.JavaCalculator;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class CalculatorOperations {
    private static final MathContext mc = new MathContext(3, RoundingMode.HALF_UP);

    public static BigInteger add(BigInteger num1, BigInteger num2) {
        return num1.add(num2);
    }

    public static BigInteger subtract(BigInteger num1, BigInteger num2) {
        return num1.subtract(num2);
    }

    public static BigInteger multiply(BigInteger num1, BigInteger num2) {
        return num1.multiply(num2);
    }

    public static BigDecimal divide(BigInteger num1, BigInteger num2) {
        return new BigDecimal(num1).divide(new BigDecimal(num2), mc);
    }

    public static BigInteger remainder(BigInteger num1, BigInteger num2) {
        return num1.remainder(num2);
    }

    public static BigInteger power(BigInteger num1, BigInteger num2) {
        int exponent = num2.intValueExact();
        if (exponent < 0) {
            throw new ArithmeticException("Negative exponent");
        }
        return num1.pow(exponent);
    }

    public static BigDecimal add(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }

    public static BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }

    public static BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }

    public static BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2, mc);
    }
}
