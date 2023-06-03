import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Please select an operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Power");
        System.out.println("6. Square Root");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                Calculator calculatorAdd = new Calculator(num1, num2);
                result = calculatorAdd.add();
                break;
            case 2:
                Calculator calculatorSubtract = new Calculator(num1, num2);
                result = calculatorSubtract.subtract();
                break;
            case 3:
                Calculator calculatorMultiply = new Calculator(num1, num2);
                result = calculatorMultiply.multiply();
                break;
            case 4:
                Calculator calculatorDivide = new Calculator(num1, num2);
                result = calculatorDivide.divide();
                break;
            case 5:
                ScientificCalculator scientificCalculatorPower = new ScientificCalculator(num1, num2);
                result = scientificCalculatorPower.power();
                break;
            case 6:
                ScientificCalculator scientificCalculatorSquareRoot = new ScientificCalculator(num1, num2);
                result = scientificCalculatorSquareRoot.squareRoot();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Result: " + result);

//        Calculator calculator = new Calculator(num1, num2);
//        System.out.println(calculator.add());
//        System.out.println(calculator.subtract());
//        System.out.println(calculator.multiply());
//        System.out.println(calculator.divide());
//
//        ScientificCalculator scientificCalculator = new ScientificCalculator(num1, num2);
//        System.out.println(scientificCalculator.power());
//        System.out.println(scientificCalculator.squareRoot());
//        System.out.println(scientificCalculator.add());
    }
}