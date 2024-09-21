import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: %.2f. New balance: %.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew: %.2f. New balance: %.2f%n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + ", Balance: " + balance;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            System.out.print("Enter account number for account " + (i + 1) + ": ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter account holder name: ");
            String accountHolderName = scanner.nextLine();
            accounts[i] = new BankAccount(accountNumber, accountHolderName);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    scanner.nextLine();
                    String depositAccount = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account != null && account.getAccountNumber().equals(depositAccount)) {
                            account.deposit(depositAmount);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    scanner.nextLine();
                    String withdrawAccount = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    for (BankAccount account : accounts) {
                        if (account != null && account.getAccountNumber().equals(withdrawAccount)) {
                            account.withdraw(withdrawAmount);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    scanner.nextLine();
                    String balanceAccount = scanner.nextLine();
                    for (BankAccount account : accounts) {
                        if (account != null && account.getAccountNumber().equals(balanceAccount)) {
                            System.out.printf("Balance: %.2f%n", account.checkBalance());
                        }
                    }
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
