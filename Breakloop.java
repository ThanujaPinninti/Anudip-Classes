import java.util.ArrayList;
import java.util.Scanner;

public class Breakloop {
    private static int balance = 120000;
    private static ArrayList<Integer> transactionHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    deposit(depositAmount);
                    break;
                case 3:
                    displayBalance();
                    break;
                case 4:
                    displayTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        balance -= amount;
        transactionHistory.add(-amount);
        System.out.println("Withdrawn amount: " + amount);
    }

    private static void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        balance += amount;
        transactionHistory.add(amount);
        System.out.println("Deposited amount: " + amount);
    }

    private static void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    private static void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (int i = 0; i < transactionHistory.size(); i++) {
            int transactionAmount = transactionHistory.get(i);
            if (transactionAmount < 0) {
                System.out.println("Withdrawn: " + (-transactionAmount));
            } else {
                System.out.println("Deposited: " + transactionAmount);
            }
        }
    }
}
