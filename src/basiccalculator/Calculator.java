package basiccalculator;


public class Calculator {

    public double calculate(String operation, double... numbers) {
        double result = numbers[0];
        switch (operation) {
            case "+":
                for (int i = 1; i < numbers.length; i++) {
                    result += numbers[i];
                }
                break;
            case "-":
                for (int i = 1; i < numbers.length; i++) {
                    result -= numbers[i];
                }
                break;
            case "*":
                for (int i = 1; i < numbers.length; i++) {
                    result *= numbers[i];
                }
                break;
            case "/":
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] == 0) {
                        System.out.println("Division by zero is not allowed");
                        return 0;
                    }
                    result /= numbers[i];
                }
                break;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
        System.out.println("Result of the operation: " + result);
        return result;
    }
}
