// Write a Java program to implement a BankAccount class using encapsulation.
// Requirements:
// 1. Create a class BankAccount with:
// ○ Private fields: accountNumber (String) and balance (double)
// ○ A constructor to initialize both fields
// ○ A getBalance() method to return the balance
// ○ A setBalance(double amount) method with validation: only set if amount ≥ 0
// ○ A deposit(double amount) method: add to balance if amount > 0
// ○ A withdraw(double amount) method: subtract if amount > 0 and ≤ balance
// 2. In the main method:
// ○ Create a BankAccount object with initial balance
// ○ Call deposit(), withdraw(), and print the final balance using getBalance()
// ○ Try direct access to balance (commented out) to show encapsulation


class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", 1000);

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}



// Output:
// Deposited: 500.0
// Withdrew: 200.0
// Invalid withdrawal amount or insufficient funds.
// Final Balance: 1300.0

