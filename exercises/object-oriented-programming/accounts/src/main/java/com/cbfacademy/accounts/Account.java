package com.cbfacademy.accounts;

public class Account {

    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    }

    public double getBalance() {
    return this.balance;
    }

    public int getAccountNumber() {
    return this.accountNumber;
    }     

    public double deposit(double amount) {
    this.balance += amount;
    return this.balance;
    }

    public double withdraw(double requested) {
    if (requested < 0 || this.balance < requested) {
        return 0;
    } else {
        this.balance -= requested;
        return requested;
    }
    }
}
