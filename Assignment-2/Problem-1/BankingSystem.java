import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Withdrawal denied.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public void calculateInterest(double rate) {
        try {
            double interest = (balance * rate) / 100;
            System.out.println("Interest: " + interest);
        } catch (ArithmeticException e) {
            System.out.println("Error in interest calculation: " + e.getMessage());
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            Bank bank = new Bank(balance);

            System.out.print("Enter withdrawal amount: ");
            double withdraw = sc.nextDouble();
            try {
                bank.withdraw(withdraw);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();
            bank.calculateInterest(rate);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
        sc.close();
    }
}
