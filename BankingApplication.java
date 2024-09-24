import java.util.Scanner;

public class BankingApplication {
    private double balance = 0.0;

    public static void main(String[] args) {
        BankingApplication bankingApp = new BankingApplication();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Simple Banking Application!");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankingApp.deposit(scanner);
                    break;
                case 2:
                    bankingApp.withdraw(scanner);
                    break;
                case 3:
                    bankingApp.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}