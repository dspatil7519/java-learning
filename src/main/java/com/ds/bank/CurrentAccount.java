package com.ds.bank;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public boolean withdraw(double amount) {
        System.out.println("getBalance() " + getBalance());
        System.out.println("getOverdraftLimit() " + getOverdraftLimit());
        System.out.println("amount " + amount);
         if (amount > 0 && (getBalance() > amount)) {
           super.withdraw(amount);
            return true;
        }else if (amount > 0 && (getBalance() + getOverdraftLimit()) >= amount) {
            updateBalance(amount- (getBalance() + getOverdraftLimit()) );
            return true;
        } else if (amount > 0 && (getBalance() + getOverdraftLimit()) < amount) {
            System.out.println("Insufficient funds including overdraft limit.");
            return false;
        } 
        return false;
        
    }

}