package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    void deposit(double amount) {
        if (amount <= 0) {
            return;
        }

        balance = balance + amount;
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        double amountWithTransactionFee = amount + transactionFee;

        if (amount <= 0 || balance - amountWithTransactionFee < 0) {
            return false;
        }

        balance = balance - amountWithTransactionFee;
        return true;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }

        return false;
    }
}