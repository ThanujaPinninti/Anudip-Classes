import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Advanced Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exponentiation (^)");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            if (choice == 7) {
                continueCalculating = false;
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        validOperation = false;
                    }
                    break;
                case 5:
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        validOperation = false;
                    }
                    break;
                case 6:
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Error! Invalid operation.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("The result is: " + result);
            }

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String userChoice = scanner.next();

            if (!userChoice.equalsIgnoreCase("yes")) {
                continueCalculating = false;
                System.out.println("Exiting the calculator. Goodbye!");
            }
        }
        scanner.close();
    }
}
