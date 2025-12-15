package com.ds.bank;

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA123", "Bob", 500.0, 200.0);

        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountDetails();
        savingsAccount.applyInterest();
        System.out.println("Balance after applying interest: " + savingsAccount.getBalance());

        System.out.println("\nCurrent Account Details:");
        currentAccount.displayAccountDetails();
        boolean success = currentAccount.withdraw(800.0);
        System.out.println("Withdrawal of 800 successful: " + success);
        System.out.println("Balance after withdrawal: " + currentAccount.getBalance());
    }

}
