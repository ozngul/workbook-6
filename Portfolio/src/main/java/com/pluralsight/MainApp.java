// src/com/pluralsight/MainApp.java
package com.pluralsight;

import com.pluralsight.finance.*;

public class MainApp {
    public static void main(String[] args) {
        // Create various Valuable objects
        Jewelry necklace = new Jewelry("Diamond Necklace", 5000, 18);
        Gold goldBar = new Gold("24K Gold Bar", 60, 2.5);
        House house = new House("Luxury Villa", 500000, 2015, 4000, 5);
        BankAccount bankAccount = new BankAccount(123, "Pam", 10000.0);
        CreditCard creditCard = new CreditCard("987654321", 2000.0);

        Valuable[] valuables = {necklace, goldBar, house, bankAccount, creditCard};

        double totalValue = 0;
        for (Valuable v : valuables) {
            System.out.println(v.getClass().getSimpleName() + " Value: $" + v.getValue());
            totalValue += v.getValue();
        }

        System.out.println("Total Portfolio Value: $" + totalValue);
    }
}
