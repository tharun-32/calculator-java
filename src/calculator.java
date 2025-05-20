import java.util.Scanner;

/**
 * calculator
 * author  tharun
 */
public class calculator {
    public static void main(String[] args) {
        System.out.println("calculator program build on java");
        // getting input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline/buffer
        System.out.print("Enter the operation you need to perform (+,-,*,/,%): ");
        char operation = scanner.next().charAt(0);
        scanner.close();
        // performing the operation using if else
        if (operation == '+') {
            int output = num1 + num2;
            System.out.println("your output is:" + output);
        } else if (operation == '-') {
            int output = num1 - num2;
            System.out.println("your output is:" + output);
        } else if (operation == '*') {
            int output = num1 * num2;
            System.out.println("your output is:" + output);
        } else if (operation == '/') {
            int output = num1 / num2;
            System.out.println("your output is:" + output);
        } else if (operation == '%') {
            int output = num1 % num2;
            System.out.println("your output is:" + output);
        } else {
            System.out.println("invalid operator is entered retry");
        }
    }
}
