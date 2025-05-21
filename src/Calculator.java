import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * calculator
 * author tharun
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("calculator program build on java");
        // getting input from the user
        Scanner scanner = new Scanner(System.in);
        // using try,catch,finally to catch the unexpected error from stoping the
        // program from running
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // Consume the leftover newline/buffer
            System.out.print("Enter the operation you need to perform (+,-,*,/,%): ");
            char operation = scanner.next().charAt(0);
            double output = 0;
            // performing the operation using if else
            if (operation == '+') {
                output = num1 + num2;
                if (output == (int) output) {
                    int result = (int) output;
                    System.out.println("your output is:" + result);
                } else {
                    System.out.println("your output is:" + output);
                }
            } else if (operation == '-') {
                output = num1 - num2;
                if (output == (int) output) {
                    int result = (int) output;
                    System.out.println("your output is:" + result);
                } else {
                    System.out.println("your output is:" + output);
                }

            } else if (operation == '*') {
                output = num1 * num2;
                if (output == (int) output) {
                    int result = (int) output;
                    System.out.println("your output is:" + result);
                } else {
                    System.out.println("your output is:" + output);
                }
            } else if (operation == '/') {
                output = num1 / num2;
                if (output == (int) output) {
                    int result = (int) output;
                    System.out.println("your output is:" + result);
                } else {
                    System.out.println("your output is:" + output);
                }
            } else if (operation == '%') {
                output = num1 % num2;
                if (output == (int) output) {
                    int result = (int) output;
                    System.out.println("your output is:" + result);
                } else {
                    System.out.println("your output is:" + output);
                }
            } else {
                System.out.println("invalid operator is entered retry");
            }
        } catch (ArithmeticException e) {
            System.out.println("you can't divide a number by zero");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        } finally {
            scanner.close();
        }
    }
}
