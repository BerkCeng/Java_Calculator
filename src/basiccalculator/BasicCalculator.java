package basiccalculator;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values for the operation: ");
        int count = scanner.nextInt();
        double[] numbers = new double[count];

        System.out.println("\nAvailable operations:  / , * , - , + \n");
        System.out.print("Enter the operation you want to perform: ");
        String operation = scanner.next();
        while (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
            System.out.println("Invalid operation. Please try again.");
            operation = scanner.next();
        }

        System.out.println("Enter the numbers for the operation: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        Calculator calculator = new Calculator();
        System.out.println(" ");
        calculator.calculate(operation, numbers);
    }
}
