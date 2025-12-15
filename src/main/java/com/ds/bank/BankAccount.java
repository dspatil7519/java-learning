package com.ds.bank;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }


    public void deposit(double amount) {
    System.out.println("Operation: deposit to BankAccount");
        if (amount > 0) {
            balance += amount;
         System.out.println("Status: Successful");
         System.out.println("New Balance: " + balance);

        } else {
         System.out.println("Status: Failed - Invalid amount");
        }
    }

    public boolean withdraw(double amount) {
        System.out.println("Operation: Withdraw from BankAccount");
        if (amount > 0 && amount <= balance) {
            balance -= amount;
             System.out.println("Status: Successful");
             System.out.println("New Balance: " + balance);
            return true;
        }
         System.out.println("Status: failed - Insufficient funds or invalid amount");
        return false;
    }

    public double getBalance() {    
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

}
