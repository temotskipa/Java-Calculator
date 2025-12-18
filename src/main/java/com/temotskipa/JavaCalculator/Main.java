import static com.temotskipa.JavaCalculator.Calculator.handleDecimal;
import static com.temotskipa.JavaCalculator.Calculator.handleInteger;
import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {
    String input1 = readln("Enter first number:");
    if (input1 == null) {
        println("No input provided.");
        return;
    }
    String input2 = readln("Enter second number:");
    if (input2 == null) {
        println("No input provided.");
        return;
    }

    input1 = input1.trim();
    input2 = input2.trim();

    boolean isDecimal = input1.contains(".") || input2.contains(".");
    if (isDecimal) {
        handleDecimal(input1, input2);
    } else {
        handleInteger(input1, input2);
    }
}