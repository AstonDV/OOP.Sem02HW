public class ScientificCalculator extends Calculator {
    public ScientificCalculator(double num1, double num2) {
        super(num1, num2);
    }

    public double power() {
        return Math.pow(num1, num2);
    }

    public double squareRoot() {
        return Math.sqrt(num1);
    }
}