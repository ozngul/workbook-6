// src/com/pluralsight/FinanceApplication.java
package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500.0);
        Valuable account2 = new BankAccount(456, "Gary", 1500.0);

        // Try to deposit money into both accounts
        account1.deposit(100); // This will work
        // account2.deposit(100); // This will not work

        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Value: $" + account2.getValue());
    }
}
