import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int greatest;
        if (num1 > num2) {
            greatest = num1;
        } else if (num2 > num1) {
            greatest = num2;
        } else {
            greatest = num1; 
            System.out.println("Both numbers are equal.");
            
            return;
        }

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}
