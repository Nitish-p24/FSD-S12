package com.example.inheritance;

public class BankAccount {

    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
