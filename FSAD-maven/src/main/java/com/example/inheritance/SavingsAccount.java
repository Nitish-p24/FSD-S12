package com.example.inheritance;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void calculateInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}
