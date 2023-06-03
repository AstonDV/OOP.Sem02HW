import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator(num1, num2);
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

        ScientificCalculator scientificCalculator = new ScientificCalculator(num1, num2);
        System.out.println(scientificCalculator.power());
        System.out.println(scientificCalculator.squareRoot());
        System.out.println(scientificCalculator.add());
    }
}