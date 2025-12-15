package com.ds.bank;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "Alice", 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA123", "Bob", 500.0, 200.0);

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);           
        System.out.println("\n All Bank Accounts:");
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            account.deposit(100);   
           // account.displayAccountDetails();
            account.withdraw(200);   
            //account.displayAccountDetails(); 
            System.out.println("-----------------------");
    }

}
}
