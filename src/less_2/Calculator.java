package less_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner request = new Scanner(System.in);
        System.out.println("Enter operand 1:");
        double operand1 = request.nextDouble();

        System.out.println("Enter operand 2:");
        double operand2 = request.nextDouble();

        System.out.println("Enter sign:");
        String sign = request.next();

        switch (sign) {
            case "+":
                printResult(operand1, operand2, sign, (operand1 + operand2));
                break;
            case "-":
                printResult(operand1, operand2, sign, (operand1 - operand2));
                break;
            case "*":
                printResult(operand1, operand2, sign, (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    printError("Divide by zero!!!");
                    break;
                }

                printResult(operand1, operand2, sign, (operand1 / operand2));
                break;
            default:
                printError("Sign [" + sign + "] undefined!!!");
        }
    }

    private static void printResult(double operand1, double operand2, String sign, Double result)
    {
        System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);
    }

    private static void printError(String message)
    {
        System.out.println("Error:: " + message);
    }
}
