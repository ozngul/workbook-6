package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        // Credit card debt is usually a negative asset
        return -balance;
    }
}