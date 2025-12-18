import com.temotskipa.JavaCalculator.Calculator;

void main() {
    String input1 = IO.readln("Enter first number:");
    if (input1 == null) {
        IO.println("No input provided.");
        return;
    }
    String input2 = IO.readln("Enter second number:");
    if (input2 == null) {
        IO.println("No input provided.");
        return;
    }

    input1 = input1.trim();
    input2 = input2.trim();

    boolean isDecimal = input1.contains(".") || input2.contains(".");
    if (isDecimal) {
        Calculator.handleDecimal(input1, input2);
    } else {
        Calculator.handleInteger(input1, input2);
    }
}