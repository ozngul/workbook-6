// src/com/pluralsight/finance/BankAccount.java
package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private int accountNumber;
    private String owner;
    private double balance;

    public BankAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public double getValue() {
        return balance;
    }
}
